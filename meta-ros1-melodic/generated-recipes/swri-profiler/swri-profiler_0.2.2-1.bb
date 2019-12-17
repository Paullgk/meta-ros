# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "swri_profiler provides basic tools for real-time selective     profiling of ROS C++ nodes."
AUTHOR = "P. J. Reed <preed@swri.org>"
HOMEPAGE = "https://github.com/swri-robotics/swri_profiler.git"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "swri_profiler"
ROS_BPN = "swri_profiler"

ROS_BUILD_DEPENDS = " \
    diagnostic-updater \
    roscpp \
    rospy \
    std-msgs \
    swri-profiler-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    diagnostic-updater \
    roscpp \
    rospy \
    std-msgs \
    swri-profiler-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    diagnostic-updater \
    rosbridge-server \
    roscpp \
    rospy \
    std-msgs \
    swri-profiler-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/swri-robotics-gbp/swri_profiler-release/archive/release/melodic/swri_profiler/0.2.2-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/swri_profiler"
SRC_URI = "git://github.com/swri-robotics-gbp/swri_profiler-release;${ROS_BRANCH};protocol=https"
SRCREV = "93af514411f0d334c6be1c926aa29971f71fb812"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
