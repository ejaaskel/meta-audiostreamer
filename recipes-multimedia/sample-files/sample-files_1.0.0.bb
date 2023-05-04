SUMMARY = "Recipe installing audio samples for testing"
LICENSE = "MIT"
#LIC_FILES_CHECKSUM = "${COMMON_LICENSE_DIR}/MIT" 
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"
SRC_URI = " \
    file://sample1.wav \
    file://sample2.wav \
    file://sample3.wav \
"

do_install() {
    install -d ${D}/opt/sample-files
    install -m 644 ${WORKDIR}/sample1.wav ${D}/opt/sample-files
    install -m 644 ${WORKDIR}/sample2.wav ${D}/opt/sample-files
    install -m 644 ${WORKDIR}/sample3.wav ${D}/opt/sample-files
}

FILES:${PN} = "/opt/*"
