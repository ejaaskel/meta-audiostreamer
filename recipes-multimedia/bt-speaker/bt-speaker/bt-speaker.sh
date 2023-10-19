#!/bin/sh

# Quick start-stop-daemon example, derived from Debian /etc/init.d/ssh
set -e

# Must be a valid filename
NAME=bt_speaker
PIDFILE=/var/run/$NAME.pid
#This is the command to be run, give the full pathname
DAEMON=/opt/bt-speaker/$NAME.py
DAEMON_OPTS=""

export PATH="${PATH:+$PATH:}/usr/sbin:/sbin"

case "$1" in
  start)
        echo -n "Starting daemon: "$NAME
	# Power cycle and sleep for a bit
	# Seems like otherwise the bt will reset during advertisement and bt-speaker cant recover from that
        bluetoothctl power off
        bluetoothctl power on
        sleep 5
	start-stop-daemon --start --quiet --pidfile $PIDFILE --background -d /opt/bt-speaker --exec $DAEMON -- $DAEMON_OPTS
        echo "."
	;;
  stop)
        echo -n "Stopping daemon: "$NAME
	start-stop-daemon --stop --quiet --oknodo --pidfile $PIDFILE
        echo "."
	;;
  restart)
        echo -n "Restarting daemon: "$NAME
	start-stop-daemon --stop --quiet --oknodo --retry 30 --pidfile $PIDFILE
	start-stop-daemon --start --quiet --pidfile $PIDFILE --exec $DAEMON -- $DAEMON_OPTS
	echo "."
	;;

  *)
	echo "Usage: "$1" {start|stop|restart}"
	exit 1
esac

exit 0
