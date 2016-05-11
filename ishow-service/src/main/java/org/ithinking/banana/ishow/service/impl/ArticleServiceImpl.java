package org.ithinking.banana.ishow.service.impl;

import com.github.pagehelper.PageHelper;
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

    /**
     * 分页获取作品
     *
     * @param pageNum 页码,从1开始计数
     * @return
     */
    @Override
    public List<Article> getArticlePage(Integer pageNum) {
        //获取第1页，10条内容，默认查询总数count
       // PageHelper.startPage(pageNum, 10);
        List<Article> result = articleMapper.getArticleList();
        return result;
    }
}
