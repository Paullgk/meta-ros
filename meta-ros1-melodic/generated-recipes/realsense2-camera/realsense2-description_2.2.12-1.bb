# Generated by superflore -- DO NOT EDIT

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "RealSense Camera description package for Intel 3D D400 cameras"
AUTHOR = "Sergey Dorodnicov <sergey.dorodnicov@intel.com>"
ROS_AUTHOR = "Sergey Dorodnicov <sergey.dorodnicov@intel.com>"
HOMEPAGE = "http://www.ros.org/wiki/RealSense"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

ROS_CN = "realsense2_camera"
ROS_BPN = "realsense2_description"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    xacro \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    rosunit \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/IntelRealSense/realsense-ros-release/archive/release/melodic/realsense2_description/2.2.12-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/realsense2_description"
SRC_URI = "git://github.com/IntelRealSense/realsense-ros-release;${ROS_BRANCH};protocol=https"
SRCREV = "cede0dfe7f9b9912d7da974a89dcfe61815ec472"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}