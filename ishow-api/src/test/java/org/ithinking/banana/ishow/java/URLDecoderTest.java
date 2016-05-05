package org.ithinking.banana.ishow.java;

import org.junit.Test;

import java.net.URLDecoder;

/**
 * @author agan
 */
public class URLDecoderTest {

    @Test
    public void testDecode() throws Exception{
        String url = "http://sso.ematong.com/logout?service=http%3A%2F%2Fsso.ematong.com%2Flogin%3Fl%3Dzhi%26service%3Dhttp%3A%2F%2Fzhihui.ematong.com%2Fshiro-cas";
        String dUrl = URLDecoder.decode(url, "utf-8");
        System.out.println(dUrl);
        System.out.println("============================");
    }
}
