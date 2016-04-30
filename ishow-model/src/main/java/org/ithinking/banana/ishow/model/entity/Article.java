package org.ithinking.banana.ishow.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * @author agan
 */
@Entity
@Table(name = "is_article")
public class Article {
    // 作品ID，主键
    private Long articleId;
    // 作者ID
    private Long authorId;
    // 作者名称/昵称
    private String authorName;
    // 文章/作品标题
    private String title;
    // 文章/作品内容
    private String content;
    // 作品图片URL
    private String imageUrl;
    // 作品视频URL
    private String videoUrl;
    // 赏金级别1次数(铜赏.1分)
    private Long bounty1Total;
    // 赏金级别2次数(银赏.1毛)
    private Long bounty2Total;
    // 赏金级别3次数(金赏.1元)
    private Long bounty3Total;
    // 赏金级别4次数(钻赏.10元)
    private Long bounty4Total;
    // 赏金总额(单位:分)
    private Long bountyAmount;
    // 禁止标识(0:未禁止;1:禁止)
    private String banFlag;
    // 举报累计次数
    private Long tipOffTotal;
    // 区域代码
    private String areaCode;
    // 作品创建时间
    private Date createTime;

    @Id
    @Column(name = "article_id")
    public Long getArticleId() {
        return articleId;
    }

    public void setArticleId(Long articleId) {
        this.articleId = articleId;
    }

    @Column(name = "author_id")
    public Long getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Long authorId) {
        this.authorId = authorId;
    }

    @Column(name = "author_name")
    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    @Column(name = "title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Column(name = "content")
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Column(name = "image_url")
    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Column(name = "video_url")
    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    @Column(name = "bounty1_total")
    public Long getBounty1Total() {
        return bounty1Total;
    }

    public void setBounty1Total(Long bounty1Total) {
        this.bounty1Total = bounty1Total;
    }

    @Column(name = "bounty2_total")
    public Long getBounty2Total() {
        return bounty2Total;
    }

    public void setBounty2Total(Long bounty2Total) {
        this.bounty2Total = bounty2Total;
    }

    @Column(name = "bounty3_total")
    public Long getBounty3Total() {
        return bounty3Total;
    }

    public void setBounty3Total(Long bounty3Total) {
        this.bounty3Total = bounty3Total;
    }

    @Column(name = "bounty4_total")
    public Long getBounty4Total() {
        return bounty4Total;
    }

    public void setBounty4Total(Long bounty4Total) {
        this.bounty4Total = bounty4Total;
    }

    @Column(name = "bounty_amount")
    public Long getBountyAmount() {
        return bountyAmount;
    }

    public void setBountyAmount(Long bountyAmount) {
        this.bountyAmount = bountyAmount;
    }

    @Column(name = "ban_flag")
    public String getBanFlag() {
        return banFlag;
    }

    public void setBanFlag(String banFlag) {
        this.banFlag = banFlag;
    }

    @Column(name = "tipOff_total")
    public Long getTipOffTotal() {
        return tipOffTotal;
    }

    public void setTipOffTotal(Long tipOffTotal) {
        this.tipOffTotal = tipOffTotal;
    }

    @Column(name = "area_code", nullable = false)
    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    @Column(name = "create_time")
    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
