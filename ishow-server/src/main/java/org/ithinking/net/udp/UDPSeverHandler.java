package org.ithinking.net.udp;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.channel.socket.DatagramPacket;

/**
 * @author code by jianghuiwen
 * @filename UDPSeverHandler.java
 * @mail jianghuiwen2012@163.com
 * <p/>
 * 下午4:21:10
 */
public class UDPSeverHandler extends SimpleChannelInboundHandler<DatagramPacket> {

    /*
      channelRead0 --> messageReceived

     *(non-Javadoc)
     * @see io.netty.channel.SimpleChannelInboundHandler#messageReceived(io.netty.channel.ChannelHandlerContext, java.lang.Object)
     */
    @Override
    protected void channelRead0(ChannelHandlerContext ctx,
                                DatagramPacket packet) throws Exception {
        // TODO Auto-generated method stub

        ByteBuf buf = packet.copy().content();
        byte[] req = new byte[buf.readableBytes()];
        buf.readBytes(req);
        String body = new String(req, "UTF-8");
        System.out.println(body);

    }

    /* (non-Javadoc)
     * @see io.netty.channel.ChannelHandlerAdapter#channelRegistered(io.netty.channel.ChannelHandlerContext)
     */
    @Override
    public void channelRegistered(ChannelHandlerContext ctx) throws Exception {
        // TODO Auto-generated method stub
        super.channelRegistered(ctx);
        //System.out.println("I got it!");
    }
 
  /* (non-Javadoc)
   * @see io.netty.channel.ChannelHandlerAdapter#channelReadComplete(io.netty.channel.ChannelHandlerContext)
   */


}