/*
 * This file is part of the Locked Window Size project, licensed under the
 * GNU Lesser General Public License v3.0
 *
 * Copyright (C) 2024  Fallen_Breath and contributors
 *
 * Locked Window Size is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Locked Window Size is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with Locked Window Size.  If not, see <https://www.gnu.org/licenses/>.
 */

package me.fallenbreath.lockedwindowsize.mixins;

import me.fallenbreath.lockedwindowsize.LockedWindowSizeMod;
import net.minecraft.client.util.Window;
import org.lwjgl.glfw.GLFW;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Window.class)
public abstract class WindowMixin
{
	@Inject(
			method = "<init>",
			at = @At(
					value = "INVOKE",
					target = "Lorg/lwjgl/glfw/GLFW;glfwDefaultWindowHints()V",
					shift = At.Shift.AFTER,
					remap = false
			),
			remap = true
	)
	private void applySomeGlfwWindowHint(CallbackInfo ci)
	{
		GLFW.glfwWindowHint(GLFW.GLFW_RESIZABLE, GLFW.GLFW_FALSE);
		LockedWindowSizeMod.LOGGER.info("Window size locked");
	}
}
