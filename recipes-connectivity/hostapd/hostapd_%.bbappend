FILESEXTRAPATHS:prepend := "${THISDIR}/hostapd:"

SRC_URI += "file://hostapd.conf"

do_install:prepend() {
    cp ${WORKDIR}/hostapd.conf ${B}/hostapd.conf
}
