package org.ithinking.banana.ishow.controller;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

import org.ithinking.banana.ishow.Application;
import org.ithinking.banana.ishow.model.entity.Article;
import org.ithinking.banana.ishow.service.ArticleService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.IntegrationTest;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.client.RestTemplate;

import java.net.URL;
import java.util.List;

/**
 * @author agan
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@WebAppConfiguration
@IntegrationTest({"server.port=80"})
public class ArticleControllerTest {
    @Value("${server.port}")
    private int port;
    private URL base;
    private RestTemplate template;

    @Autowired
    private ArticleService articleService;

    @Before
    public void setUp() throws Exception {
        this.base = new URL("http://localhost:" + port + "/");
        template = new TestRestTemplate();
    }

    @Test
    public void getHello() throws Exception {
        ResponseEntity<String> response = template.getForEntity(base.toString(), String.class);
        assertThat(response.getBody(), equalTo("Greetings from Spring Boot!"));
    }

    @Test
    public void testGetArticleList(){
        List<Article> articleList = articleService.getArticleList();
        System.out.println(articleList);
    }
}
