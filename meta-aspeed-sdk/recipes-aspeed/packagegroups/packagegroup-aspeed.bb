SUMMARY = "AspeedTech BMC Package Group"

PR = "r2"

inherit packagegroup

PROVIDES = "${PACKAGES}"
RPROVIDES_${PN} = "${PACKAGES}"

PACKAGES_append = " \
    ${PN}-apps \
    ${PN}-ssp \
    ${PN}-crypto \
    ${PN}-ssif \
    "

SUMMARY_${PN}-apps = "AspeedTech Test App"
RDEPENDS_${PN}-apps = " \
    aspeed-app \
    "

SUMMARY_${PN}-ssp = "AspeedTech Secondary Service Processor"
RDEPENDS_${PN}-ssp = " \
    ssp \
    "
RRECOMMENDS_${PN}-ssp= " \
    kernel-module-aspeed-ssp \
    "

SUMMARY_${PN}-crypto = "AspeedTech Crypto"
RDEPENDS_${PN}-crypto = " \
    libcrypto \
    libssl \
    openssl \
    openssl-bin \
    openssl-conf \
    openssl-misc \
    "
RRECOMMENDS_${PN}-crypto = " \
    kernel-module-cryptodev \
    "

SUMMARY_${PN}-ssif = "IPMI SMBus System Interface"
RDEPENDS_${PN}-ssif = " \
    "
RRECOMMENDS_${PN}-ssif= " \
    kernel-module-ipmi-msghandler \
    kernel-module-ipmi-ssif \
    kernel-module-ipmi-si \
    kernel-module-ipmi-devintf \
    "
