package org.ithinking.net.udp;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioDatagramChannel;

/**
 * Created by test on 2016/5/10.
 */
public class UDPServer {
    public static void main(String[] args) throws InterruptedException {
        // TODO Auto-generated method stub
        Bootstrap b = new Bootstrap();
        EventLoopGroup group = new NioEventLoopGroup();
        b.group(group)
                .channel(NioDatagramChannel.class)
                .option(ChannelOption.SO_BROADCAST, true)
                .handler(new UDPSeverHandler());

        b.bind(9999).sync().channel().closeFuture().await();
    }
}
