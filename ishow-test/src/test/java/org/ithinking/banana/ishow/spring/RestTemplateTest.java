package org.ithinking.banana.ishow.spring;

import org.junit.Test;
import org.springframework.web.client.RestTemplate;

/**
 * @author agan
 */
public class RestTemplateTest {

    @Test
    public void testGetForObject(){
        RestTemplate restTemplate = new RestTemplate();
        String html = restTemplate.getForObject("https://www.baidu.com/?tn=92046218_hao_pg", String.class);
        System.out.println("\n\n========================================================================");
        System.out.println(html);
    }
}
