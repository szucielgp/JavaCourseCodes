package io.github.kimmking.gateway.filter;

import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.http.FullHttpRequest;

import java.nio.charset.Charset;

/**
 * @author romanlu
 * @date 2020-11-04 23:41
 * @Description:
 */
public class HttpRequestFilterImpl implements HttpRequestFilter {

    @Override
    public void filter(FullHttpRequest fullRequest, ChannelHandlerContext ctx) {
        System.out.println("请求处理器1");
        ctx.channel().writeAndFlush(Unpooled.copiedBuffer("hello word1" , Charset.forName("gb2312")));
    }
}
