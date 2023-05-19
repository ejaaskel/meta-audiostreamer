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


#IMAGE_INSTALL:raspberrypi2:append = " \
#    linux-firmware-mt7601u "
IMAGE_INSTALL:append:raspberrypi2 = " \
  audiostreamer-manager-client  rtl8821au hostapd hostapd-server "
IMAGE_INSTALL:append:raspberrypi4 = " \
  audiostreamer-manager-server "

#    pulseaudio \
#    pulseaudio-server \
#    pulseaudio-module-null-sink \
#    pulseaudio-module-rtp-send \
#    pulseaudio-module-rtp-recv \
#    pulseaudio-module-zeroconf-publish \
#    pulseaudio-module-zeroconf-discover \
#    pulseaudio-module-native-protocol-tcp \
#
