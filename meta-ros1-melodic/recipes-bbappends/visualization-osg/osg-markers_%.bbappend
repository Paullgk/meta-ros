# Copyright (c) 2020 LG Electronics, Inc.

PNBLACKLIST[osg-markers] ?= "${@bb.utils.contains('ROS_WORLD_SKIP_GROUPS', 'osg', 'depends on unavailable UNRESOLVED-libopenscenegraph', '', d)}"