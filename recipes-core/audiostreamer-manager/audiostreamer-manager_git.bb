inherit cargo

SRC_URI = "git://github.com/ejaaskel/audiostreamer-manager.git;protocol=https;branch=master"
SRCREV="${AUTOREV}"
#LIC_FILES_CHKSUM="file://COPYRIGHT;md5=e6b2207ac3740d2d01141c49208c2147"
#SRC_URI += " \
#    crate://crates.io/autocfg/1.1.0 \
#    crate://crates.io/proc-macro2/1.0.56 \
#    crate://crates.io/unicode-ident/1.0.8 \
#    crate://crates.io/quote/1.0.26 \
#    crate://crates.io/syn/1.0.109 \
#    crate://crates.io/libc/0.2.142 \
#    crate://crates.io/futures-core/0.3.28 \
#    crate://crates.io/scopeguard/1.1.0 \
#    crate://crates.io/log/0.4.17 \
#    crate://crates.io/cfg-if/1.0.0 \
#    crate://crates.io/futures-sink/0.3.28 \
#    crate://crates.io/lock_api/0.4.9 \
#    crate://crates.io/polling/2.8.0 \
#    crate://crates.io/spin/0.9.8 \
#    crate://crates.io/if-addrs/0.7.0 \
#    crate://crates.io/socket2/0.4.9 \
#    crate://crates.io/pin-project-internal/1.0.12 \
#    crate://crates.io/pin-project/1.0.12 \
#    crate://crates.io/flume/0.10.14 \
#    crate://crates.io/mdns-sd/0.7.2 \
#crate://crates.io/winapi/0.3.7 \
#    crate://crates.io/bitflags/1.3.2 \
#    crate://crates.io/concurrent-queue/2.2.0 \
#    crate://crates.io/pin-project-lite/0.2.9 \
#    crate://crates.io/windows-sys/0.48.0 \
#"

SRC_URI += " \
    crate://crates.io/autocfg/1.1.0 \
    crate://crates.io/bitflags/1.3.2 \
    crate://crates.io/cfg-if/1.0.0 \
    crate://crates.io/concurrent-queue/2.2.0 \
    crate://crates.io/crossbeam-utils/0.8.15 \
    crate://crates.io/flume/0.10.14 \
    crate://crates.io/futures-core/0.3.28 \
    crate://crates.io/futures-sink/0.3.28 \
    crate://crates.io/if-addrs/0.7.0 \
    crate://crates.io/libc/0.2.142 \
    crate://crates.io/lock_api/0.4.9 \
    crate://crates.io/log/0.4.17 \
    crate://crates.io/mdns-sd/0.7.2 \
    crate://crates.io/pin-project-internal/1.0.12 \
    crate://crates.io/pin-project-lite/0.2.9 \
    crate://crates.io/pin-project/1.0.12 \
    crate://crates.io/polling/2.8.0 \
    crate://crates.io/proc-macro2/1.0.56 \
    crate://crates.io/quote/1.0.26 \
    crate://crates.io/scopeguard/1.1.0 \
    crate://crates.io/socket2/0.4.9 \
    crate://crates.io/spin/0.9.8 \
    crate://crates.io/syn/1.0.109 \
    crate://crates.io/unicode-ident/1.0.8 \
    crate://crates.io/winapi-i686-pc-windows-gnu/0.4.0 \
    crate://crates.io/winapi-x86_64-pc-windows-gnu/0.4.0 \
    crate://crates.io/winapi/0.3.9 \
    crate://crates.io/windows-sys/0.48.0 \
    crate://crates.io/windows-targets/0.48.0 \
    crate://crates.io/windows_aarch64_gnullvm/0.48.0 \
    crate://crates.io/windows_aarch64_msvc/0.48.0 \
    crate://crates.io/windows_i686_gnu/0.48.0 \
    crate://crates.io/windows_i686_msvc/0.48.0 \
    crate://crates.io/windows_x86_64_gnu/0.48.0 \
    crate://crates.io/windows_x86_64_gnullvm/0.48.0 \
    crate://crates.io/windows_x86_64_msvc/0.48.0 \
"

PACKAGES += "${PN}-server ${PN}-client"
#PACKAGES:remove = "${PN}"
FILES:${PN} = ""
FILES:${PN}-client = "${bindir}/client"
FILES:${PN}-server = "${bindir}/server"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SUMMARY = "Audiostreamer manager"
LICENSE = "MIT"

S = "${WORKDIR}/git"

#BBCLASSEXTEND = "native"
