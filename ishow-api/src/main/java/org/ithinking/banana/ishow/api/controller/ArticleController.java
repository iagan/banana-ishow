package org.ithinking.banana.ishow.api.controller;

import org.ithinking.banana.ishow.model.entity.Article;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author agan
 */
@RestController
public class ArticleController {

    @RequestMapping("/articles")
    List<Article> getArticleList() {
        List<Article> articles = new ArrayList<>();
        Article article;
        for (int i = 0; i < 3; i++) {
            article = new Article();
            article.setTitle("title" + i);
            article.setContent("content" + i);
            articles.add(article);
        }
        return articles;
    }
}
