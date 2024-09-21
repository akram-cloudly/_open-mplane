SUMMARY = "Generic M-Plane HAL"
DESCRIPTION = "Open M-Plane Server"
SECTION = "base"
LICENSE = "Meta-MIT"
LIC_FILES_CHKSUM = "file://${META_MPLANE_DIR}/licenses/Meta-MIT;md5=ae79e563b8a09c8fc37978f18dbaa640"

FILESEXTRAPATHS_append := ":${META_MPLANE_DIR}/.."

SRC_URI = "file://libhalmplane"

S = "${WORKDIR}/libhalmplane"

inherit cmake

DEPENDS += "libtinyxml2"

# set this as appropriate
BUILD_BOARD ?= "example"

EXTRA_OECMAKE_append += " -DBUILD_BOARD=${BUILD_BOARD}"
EXTRA_OECMAKE_append += " -DCONTEXT=YOCTO"

PROVIDES += "virtual/halmplane"
RPROVIDES_${PN} += "virtual/halmplane"
