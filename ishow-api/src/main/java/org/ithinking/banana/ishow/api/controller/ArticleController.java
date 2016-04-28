package org.ithinking.banana.ishow.api.controller;

import org.ithinking.banana.ishow.model.entity.Article;
import org.ithinking.banana.ishow.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
        List<Article> articleList = articleService.getArticleList();
        return articleList;
    }
}
