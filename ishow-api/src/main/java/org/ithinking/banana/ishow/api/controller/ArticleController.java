package org.ithinking.banana.ishow.api.controller;

import org.ithinking.banana.ishow.model.entity.Article;
import org.ithinking.banana.ishow.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author agan
 */
@RestController
public class ArticleController {

    @Autowired
    private ArticleService articleService;

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
        try{
            List<Article> articles1 = articleService.getArticleList();
            System.out.print(articles1);
        }catch (Exception e){
            e.printStackTrace();
        }
        return articles;
    }
}
