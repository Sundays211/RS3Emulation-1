/*
 * This file is part of Ieldor.
 *
 * Ieldor is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Ieldor is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Ieldor.  If not, see <http://www.gnu.org/licenses/>.
 */
package net.ieldor.network.packet.handlers;

import net.ieldor.game.model.player.Player;
import net.ieldor.network.packet.PacketHandler;
import net.ieldor.network.packet.context.CommandContext;

/**
 * An {@link PacketHandler} that handles commands sent by a user.
 *
 * @author Thomas Le Godais <thomaslegodais@live.com>
 *
 */
public class CommandHandler implements PacketHandler<CommandContext> {
	
	/* (non-Javadoc)
	 * @see net.ieldor.network.packet.PacketHandler#handle(net.ieldor.game.model.player.Player, net.ieldor.network.packet.PacketContext)
	 */
	@Override
	public void handle(Player player, CommandContext context) {		
/*		if(context.getArguments()[0].equals("item")) {
			if (context.getArguments().length == 3) {
				player.getInventory().add(Integer.parseInt(context.getArguments()[1]), Integer.parseInt(context.getArguments()[2]));
			} else {
				player.getInventory().add(Integer.parseInt(context.getArguments()[1]), 1);
			}
			player.getInventory().refresh();
		}*/
	}
}
