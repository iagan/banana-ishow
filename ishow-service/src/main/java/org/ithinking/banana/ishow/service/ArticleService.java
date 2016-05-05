package org.ithinking.banana.ishow.service;

import org.ithinking.banana.ishow.model.entity.Article;

import java.util.List;

/**
 * @author agan
 */
public interface ArticleService {

    List<Article> getArticleList();

    List<Article> getArticlePage(Integer pageNo);
}
