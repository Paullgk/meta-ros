# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "The dccomms_ros_msgs package"
AUTHOR = "Diego Centelles <centelld@uji.es>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "TODO"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=2c00b8d2854109dbebef7818b4dae1e2"

ROS_CN = "dccomms_ros_pkgs"
ROS_BPN = "dccomms_ros_msgs"

ROS_BUILD_DEPENDS = " \
    actionlib \
    actionlib-msgs \
    message-generation \
    roscpp \
    std-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    actionlib \
    actionlib-msgs \
    message-runtime \
    roscpp \
    std-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    actionlib \
    actionlib-msgs \
    message-runtime \
    roscpp \
    std-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/dcentelles/dccomms_ros_pkgs-release/archive/release/melodic/dccomms_ros_msgs/0.0.2-3.tar.gz
ROS_BRANCH ?= "branch=release/melodic/dccomms_ros_msgs"
SRC_URI = "git://github.com/dcentelles/dccomms_ros_pkgs-release;${ROS_BRANCH};protocol=https"
SRCREV = "35e100767d216cfafaa277ac537855720033dda2"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
