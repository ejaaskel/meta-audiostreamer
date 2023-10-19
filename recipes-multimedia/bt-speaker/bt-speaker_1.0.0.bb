SUMMARY = "Bluetooth audio daemon"
#LICENSE gpl3
LICENSE = "GPL-3.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d32239bcb673463ab874e80d47fae504"
SRC_URI = "\
    git://github.com/lukasjapan/bt-speaker.git;protocol=https;branch=master \
    file://bt-speaker.sh \
    file://fix-bt-speaker.patch \
    file://0001-change-play-command-device.patch \
"

S = "${WORKDIR}/git"

SRCREV = "55cb722b261004203ef0085204b90186c052b8d8"
#inherit useradd

inherit update-rc.d
INITSCRIPT_NAME = "bt-speaker"
INITSCRIPT_PARAMS = "defaults 90 10"

#TARGET_CC_ARCH += "${LDFLAGS}"
#EXTRA_OEMAKE:append = " 'LDFLAGS=${LDFLAGS}'"
#RDEPENDS:${PN} = "bluez5 perl python3 python3-pygobject python3-cffi python3-dbus python3-pyalsaaudio sound-theme-freedesktop vorbis-tools"
RDEPENDS:${PN} = "bluez5 perl python3 python3-pygobject python3-cffi python3-dbus python3-pyalsaaudio"

#USERADD_PACKAGES = "${PN}" 

#USERADD_PARAM:${PN} = "btspeaker -G audio -d /opt/bt_speaker"
#USERADD_PARAM:${PN} = "btspeaker -G audio,bluetooth -d /opt/bt_speaker"
#GROUPADD_PARAM = ""

do_compile() {
    cd ${S}/codecs
    oe_runmake
}

do_install() {
    install -d ${D}/opt/
    cp -a ${S} ${D}/opt/bt-speaker
    install -d ${D}/etc/bt_speaker/hooks
    cp -n ${D}/opt/bt-speaker/config.ini.default ${D}/etc/bt_speaker/config.ini
    cp -n ${D}/opt/bt-speaker/hooks.default/connect ${D}/etc/bt_speaker/hooks/connect
    cp -n ${D}/opt/bt-speaker/hooks.default/disconnect ${D}/etc/bt_speaker/hooks/disconnect
    cp -n ${D}/opt/bt-speaker/hooks.default/startup ${D}/etc/bt_speaker/hooks/startup
    cp -n ${D}/opt/bt-speaker/hooks.default/track ${D}/etc/bt_speaker/hooks/track

    rm -f ${D}/opt/bt-speaker/librtpsbc*
    rm -f ${D}/opt/bt-speaker/codecs/*.o
    rm -rf ${D}/opt/bt-speaker/.git
    rm -rf ${D}/opt/bt-speaker/.gitignore
    rm -rf ${D}/opt/bt-speaker/.pc
    rm -rf ${D}/opt/bt-speaker/install.sh

    cp ${D}/opt/bt-speaker/codecs/librtpsbc.so ${D}/opt/bt-speaker/librtpsbc_aarch64.so

    chown -R root:root ${D}/opt/bt-speaker

    install -d ${D}/${INIT_D_DIR}
    install -m 0755 ${WORKDIR}/bt-speaker.sh ${D}${INIT_D_DIR}/bt-speaker
}

FILES:${PN}:append = " /opt/bt-speaker/*"
