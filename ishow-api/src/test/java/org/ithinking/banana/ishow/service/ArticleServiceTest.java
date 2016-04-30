package org.ithinking.banana.ishow.service;

import org.ithinking.banana.ishow.Application;
import org.ithinking.banana.ishow.model.entity.Article;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @author agan
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
public class ArticleServiceTest {

    @Autowired
    private ArticleService articleService;

    @Test
    public void testGetArticleList(){
        List<Article> list = articleService.getArticleList();
        System.out.println(list);
    }
}
