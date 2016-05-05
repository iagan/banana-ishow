package org.ithinking.banana.ishow.api.controller;

import org.ithinking.banana.ishow.model.entity.Article;
import org.ithinking.banana.ishow.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

    /**
     * 分页获取文章列表
     *
     * @param pageNum
     * @return
     */
    @RequestMapping("/articlePage")
    public List<Article> getArticlePage(Integer pageNum){
        return articleService.getArticlePage(pageNum == null ? 1 : pageNum);
    }

    /**
     * 奖赏一分钱
     */
    public void clickPenny(@RequestParam("authorId")Long authorId, @RequestParam("articleId")Long articleId){
        // 1.从账号中减钱
        // 2.加入钱
        // 3.
    }

    // 银
    public void clickSilver(){

    }

    // 金
    public void clickGold(){

    }


    // 钻石
    public void clickDiamond(){

    }
}
