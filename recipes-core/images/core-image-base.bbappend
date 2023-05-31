IMAGE_INSTALL:append = " \
    gstreamer1.0-meta-base \
    gstreamer1.0-meta-audio \
    gstreamer1.0-plugins-good-udp \
    gstreamer1.0-plugins-good-rtp \
    gstreamer1.0-plugins-good-alaw \
    alsa-utils \
    iperf2 \
    iperf3 \
    bt-speaker \
"

IMAGE_INSTALL:append:raspberrypi2 = " \
  audiostreamer-manager-client  rtl8821au hostapd hostapd-server dnsmasq-systemd "
IMAGE_INSTALL:append:raspberrypi4 = " \
  audiostreamer-manager-server "

