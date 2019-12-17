# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "The rosbag_editor package"
AUTHOR = "dfaconti <davide.faconti@gmail.com>"
HOMEPAGE = "http://wiki.ros.org/rosbag_editor"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=58e54c03ca7f821dd3967e2a2cd1596e"

ROS_CN = "rosbag_editor"
ROS_BPN = "rosbag_editor"

ROS_BUILD_DEPENDS = " \
    qtbase \
    rosbag \
    rosbag-storage \
    roscpp \
    tf \
    tf2-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    qtbase \
    rosbag \
    rosbag-storage \
    roscpp \
    tf \
    tf2-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    qtbase \
    rosbag \
    rosbag-storage \
    roscpp \
    tf \
    tf2-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/facontidavide/rosbag_editor-release/archive/release/melodic/rosbag_editor/0.4.2-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/rosbag_editor"
SRC_URI = "git://github.com/facontidavide/rosbag_editor-release;${ROS_BRANCH};protocol=https"
SRCREV = "68e2f310c7f043b820ebc206a83d321713d61587"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
