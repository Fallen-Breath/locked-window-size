# Locked Window Size

<img src="icon_large.png" alt="icon" width="200" height="200" align="right"/>

[![License](https://img.shields.io/github/license/Fallen-Breath/locked-window-size.svg)](http://www.gnu.org/licenses/lgpl-3.0.html)
[![workflow](https://github.com/Fallen-Breath/locked-window-size/actions/workflows/gradle.yml/badge.svg)](https://github.com/Fallen-Breath/locked-window-size/actions/workflows/gradle.yml)
[![MC Versions](https://cf.way2muchnoise.eu/versions/For%20MC_1026724_all.svg)](https://legacy.curseforge.com/minecraft/mc-mods/locked-window-size)
[![CurseForge](https://cf.way2muchnoise.eu/full_1026724_downloads.svg)](https://legacy.curseforge.com/minecraft/mc-mods/locked-window-size)
[![Modrinth](https://img.shields.io/modrinth/dt/rDa4D0QX?label=Modrinth%20Downloads)](https://modrinth.com/mod/locked-window-size)

A simple Minecraft mod that makes the game window un-resizeable

It's a client-side fabric mod that works in all version and requires no extra dependency

How does it work? With this one-line magic code:

```java
GLFW.glfwWindowHint(GLFW.GLFW_RESIZABLE, GLFW.GLFW_FALSE);
```

![screenshot](screenshot.png)
