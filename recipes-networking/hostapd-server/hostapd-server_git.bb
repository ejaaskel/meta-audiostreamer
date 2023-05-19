inherit cargo

SRC_URI = "git://github.com/ejaaskel/hostapd-server.git;protocol=https;branch=mvp"
SRCREV="${AUTOREV}"

SRC_URI += " \
    crate://crates.io/actix-codec/0.5.0 \
    crate://crates.io/actix-http/3.3.1 \
    crate://crates.io/actix-macros/0.2.3 \
    crate://crates.io/actix-router/0.5.1 \
    crate://crates.io/actix-rt/2.8.0 \
    crate://crates.io/actix-server/2.2.0 \
    crate://crates.io/actix-service/2.0.2 \
    crate://crates.io/actix-utils/3.0.1 \
    crate://crates.io/actix-web-codegen/4.2.0 \
    crate://crates.io/actix-web/4.3.1 \
    crate://crates.io/adler/1.0.2 \
    crate://crates.io/ahash/0.7.6 \
    crate://crates.io/ahash/0.8.3 \
    crate://crates.io/aho-corasick/1.0.1 \
    crate://crates.io/alloc-no-stdlib/2.0.4 \
    crate://crates.io/alloc-stdlib/0.2.2 \
    crate://crates.io/autocfg/1.1.0 \
    crate://crates.io/base64/0.21.0 \
    crate://crates.io/bitflags/1.3.2 \
    crate://crates.io/block-buffer/0.10.4 \
    crate://crates.io/brotli-decompressor/2.3.4 \
    crate://crates.io/brotli/3.3.4 \
    crate://crates.io/bytes/1.4.0 \
    crate://crates.io/bytestring/1.3.0 \
    crate://crates.io/cc/1.0.79 \
    crate://crates.io/cfg-if/1.0.0 \
    crate://crates.io/convert_case/0.4.0 \
    crate://crates.io/cookie/0.16.2 \
    crate://crates.io/cpufeatures/0.2.7 \
    crate://crates.io/crc32fast/1.3.2 \
    crate://crates.io/crypto-common/0.1.6 \
    crate://crates.io/derive_more/0.99.17 \
    crate://crates.io/digest/0.10.6 \
    crate://crates.io/encoding_rs/0.8.32 \
    crate://crates.io/flate2/1.0.26 \
    crate://crates.io/fnv/1.0.7 \
    crate://crates.io/form_urlencoded/1.1.0 \
    crate://crates.io/futures-core/0.3.28 \
    crate://crates.io/futures-sink/0.3.28 \
    crate://crates.io/futures-task/0.3.28 \
    crate://crates.io/futures-util/0.3.28 \
    crate://crates.io/generic-array/0.14.7 \
    crate://crates.io/getrandom/0.2.9 \
    crate://crates.io/h2/0.3.18 \
    crate://crates.io/hashbrown/0.12.3 \
    crate://crates.io/hermit-abi/0.2.6 \
    crate://crates.io/http/0.2.9 \
    crate://crates.io/httparse/1.8.0 \
    crate://crates.io/httpdate/1.0.2 \
    crate://crates.io/idna/0.3.0 \
    crate://crates.io/indexmap/1.9.3 \
    crate://crates.io/itoa/1.0.6 \
    crate://crates.io/jobserver/0.1.26 \
    crate://crates.io/language-tags/0.3.2 \
    crate://crates.io/libc/0.2.144 \
    crate://crates.io/local-channel/0.1.3 \
    crate://crates.io/local-waker/0.1.3 \
    crate://crates.io/lock_api/0.4.9 \
    crate://crates.io/log/0.4.17 \
    crate://crates.io/memchr/2.5.0 \
    crate://crates.io/mime/0.3.17 \
    crate://crates.io/miniz_oxide/0.7.1 \
    crate://crates.io/mio/0.8.6 \
    crate://crates.io/network-interface/1.0.1 \
    crate://crates.io/num_cpus/1.15.0 \
    crate://crates.io/once_cell/1.17.1 \
    crate://crates.io/parking_lot/0.12.1 \
    crate://crates.io/parking_lot_core/0.9.7 \
    crate://crates.io/paste/1.0.12 \
    crate://crates.io/percent-encoding/2.2.0 \
    crate://crates.io/pin-project-lite/0.2.9 \
    crate://crates.io/pin-utils/0.1.0 \
    crate://crates.io/pkg-config/0.3.27 \
    crate://crates.io/ppv-lite86/0.2.17 \
    crate://crates.io/proc-macro2/1.0.56 \
    crate://crates.io/quote/1.0.27 \
    crate://crates.io/rand/0.8.5 \
    crate://crates.io/rand_chacha/0.3.1 \
    crate://crates.io/rand_core/0.6.4 \
    crate://crates.io/redox_syscall/0.2.16 \
    crate://crates.io/regex-syntax/0.7.1 \
    crate://crates.io/regex/1.8.1 \
    crate://crates.io/rustc_version/0.4.0 \
    crate://crates.io/ryu/1.0.13 \
    crate://crates.io/scopeguard/1.1.0 \
    crate://crates.io/semver/1.0.17 \
    crate://crates.io/serde/1.0.162 \
    crate://crates.io/serde_derive/1.0.162 \
    crate://crates.io/serde_json/1.0.96 \
    crate://crates.io/serde_urlencoded/0.7.1 \
    crate://crates.io/sha1/0.10.5 \
    crate://crates.io/signal-hook-registry/1.4.1 \
    crate://crates.io/slab/0.4.8 \
    crate://crates.io/smallvec/1.10.0 \
    crate://crates.io/socket2/0.4.9 \
    crate://crates.io/syn/1.0.109 \
    crate://crates.io/syn/2.0.15 \
    crate://crates.io/thiserror-impl/1.0.40 \
    crate://crates.io/thiserror/1.0.40 \
    crate://crates.io/time-core/0.1.1 \
    crate://crates.io/time-macros/0.2.9 \
    crate://crates.io/time/0.3.21 \
    crate://crates.io/tinyvec/1.6.0 \
    crate://crates.io/tinyvec_macros/0.1.1 \
    crate://crates.io/tokio-util/0.7.8 \
    crate://crates.io/tokio/1.28.1 \
    crate://crates.io/tracing-core/0.1.30 \
    crate://crates.io/tracing/0.1.37 \
    crate://crates.io/typenum/1.16.0 \
    crate://crates.io/unicode-bidi/0.3.13 \
    crate://crates.io/unicode-ident/1.0.8 \
    crate://crates.io/unicode-normalization/0.1.22 \
    crate://crates.io/url/2.3.1 \
    crate://crates.io/version_check/0.9.4 \
    crate://crates.io/wasi/0.11.0+wasi-snapshot-preview1 \
    crate://crates.io/winapi-i686-pc-windows-gnu/0.4.0 \
    crate://crates.io/winapi-x86_64-pc-windows-gnu/0.4.0 \
    crate://crates.io/winapi/0.3.9 \
    crate://crates.io/windows-sys/0.45.0 \
    crate://crates.io/windows-sys/0.48.0 \
    crate://crates.io/windows-targets/0.42.2 \
    crate://crates.io/windows-targets/0.48.0 \
    crate://crates.io/windows_aarch64_gnullvm/0.42.2 \
    crate://crates.io/windows_aarch64_gnullvm/0.48.0 \
    crate://crates.io/windows_aarch64_msvc/0.42.2 \
    crate://crates.io/windows_aarch64_msvc/0.48.0 \
    crate://crates.io/windows_i686_gnu/0.42.2 \
    crate://crates.io/windows_i686_gnu/0.48.0 \
    crate://crates.io/windows_i686_msvc/0.42.2 \
    crate://crates.io/windows_i686_msvc/0.48.0 \
    crate://crates.io/windows_x86_64_gnu/0.42.2 \
    crate://crates.io/windows_x86_64_gnu/0.48.0 \
    crate://crates.io/windows_x86_64_gnullvm/0.42.2 \
    crate://crates.io/windows_x86_64_gnullvm/0.48.0 \
    crate://crates.io/windows_x86_64_msvc/0.42.2 \
    crate://crates.io/windows_x86_64_msvc/0.48.0 \
    crate://crates.io/zstd-safe/6.0.5+zstd.1.5.4 \
    crate://crates.io/zstd-sys/2.0.8+zstd.1.5.5 \
    crate://crates.io/zstd/0.12.3+zstd.1.5.2 \
"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SUMMARY = "HTTP server for communicating when running hostapd"
LICENSE = "MIT"

S = "${WORKDIR}/git"
