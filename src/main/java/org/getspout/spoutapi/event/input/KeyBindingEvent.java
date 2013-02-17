/*
 * This file is part of SpoutPlugin.
 *
 * Copyright (c) 2011 Spout LLC <http://www.spout.org/>
 * SpoutPlugin is licensed under the GNU Lesser General Public License.
 *
 * SpoutPlugin is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * SpoutPlugin is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.getspout.spoutapi.event.input;

import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import org.getspout.spoutapi.gui.ScreenType;
import org.getspout.spoutapi.keyboard.KeyBinding;
import org.getspout.spoutapi.player.SpoutPlayer;

public class KeyBindingEvent extends Event {
	private static final HandlerList handlers = new HandlerList();
	private final KeyBinding binding;
	private final SpoutPlayer player;

	public KeyBindingEvent(SpoutPlayer player, KeyBinding binding) {
		this.binding = binding;
		this.player = player;
	}

	public KeyBinding getBinding() {
		return binding;
	}

	public SpoutPlayer getPlayer() {
		return player;
	}

	// Convenience method
	public ScreenType getScreenType() {
		return player.getActiveScreen();
	}

	@Override
	public HandlerList getHandlers() {
		return handlers;
	}

	public static HandlerList getHandlerList() {
		return handlers;
	}
}
