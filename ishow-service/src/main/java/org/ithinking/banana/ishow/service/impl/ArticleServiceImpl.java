package org.ithinking.banana.ishow.service.impl;

import org.ithinking.banana.ishow.mapper.ArticleMapper;
import org.ithinking.banana.ishow.model.entity.Article;
import org.ithinking.banana.ishow.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author agan
 */
@Service
public class ArticleServiceImpl implements ArticleService{

    @Autowired
    private ArticleMapper articleMapper;

    @Override
    public List<Article> getArticleList() {
        return articleMapper.getArticleList();
    }
}
