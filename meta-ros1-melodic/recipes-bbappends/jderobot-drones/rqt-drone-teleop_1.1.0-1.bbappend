# Copyright (c) 2020 LG Electronics, Inc.

PNBLACKLIST[rqt-drone-teleop] ?= "${@bb.utils.contains_any('ROS_WORLD_SKIP_GROUPS', ['qt5', 'pyqt5'], 'Requires rqt-gui which depends on qt-gui which depends on qtbase which requires meta-qt5 to be included and rqt-gui-py->qt-gui->python-pyqt5 which requires pyqt5', '', d)}"