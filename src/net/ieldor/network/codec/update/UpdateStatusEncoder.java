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
package net.ieldor.network.codec.update;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;
import net.ieldor.Constants;
import net.ieldor.network.codec.messages.UpdateStatusMessage;

/**
 * An {@link MessageToByteEncoder} that writes the response of the message
 * status.
 * 
 * @author Thomas Le Godais <thomaslegodais@live.com>
 * 
 */
public class UpdateStatusEncoder extends MessageToByteEncoder<UpdateStatusMessage> {

	/**
	 * The delta for the update verification.
	 */
	/*public static final int[] UPDATE_DATA = { 2303, 69795, 41433, 35866,
		358716, 44375, 0, 18361, 24018, 124392, 976352, 336290, 478954,
		627398, 931989, 28244, 597933, 18398, 1244, 37784, 1973, 119,
		1096329, 2737242, 8010, 21656 };*/

	/**
	 * Constructs a new {@code UpdateStatusEncoder} instance.
	 */
	public UpdateStatusEncoder() {
		super(UpdateStatusMessage.class);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see io.netty.handler.codec.MessageToByteEncoder#encode(io.netty.channel.
	 * ChannelHandlerContext, java.lang.Object, io.netty.buffer.ByteBuf)
	 */
	@Override
	public void encode(ChannelHandlerContext ctx, UpdateStatusMessage msg,
			ByteBuf out) throws Exception {
		for (int i = 0; i < Constants.CACHE_DATA_SIZES.length; i++)
			out.writeInt(Constants.CACHE_DATA_SIZES[i]);
		out.writeByte(msg.getStatus());
	}
}
