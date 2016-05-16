package org.ithinking.banana.ishow.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * 作品奖金流水
 *
 * @author agan
 * @since 2016-04-29
 */
@Entity
@Table(name = "is_bounty_flow")
public class BountyFlow {
    // 流水ID，主键
    private Long flowId;
    // 作品ID
    private Long articleId;
    // 作者ID
    private Long authorId;
    // 奖赏者ID
    private Long bounterId;
    // 奖金级别(1:铜(板)，2:银(元)，3:金(币)，4:钻)
    private String bountyLevel;
    // 奖赏金额(单位分)
    private Long bountyAmount;
    // 创建时间
    private Date createTime;

    @Id
    @Column(name = "flow_id", nullable = false)
    public Long getFlowId() {
        return flowId;
    }

    public void setFlowId(Long flowId) {
        this.flowId = flowId;
    }

    @Column(name = "article_id", nullable = false)
    public Long getArticleId() {
        return articleId;
    }

    public void setArticleId(Long articleId) {
        this.articleId = articleId;
    }

    @Column(name = "author_id", nullable = false)
    public Long getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Long authorId) {
        this.authorId = authorId;
    }

    @Column(name = "bounter_id", nullable = false)
    public Long getBounterId() {
        return bounterId;
    }

    public void setBounterId(Long bounterId) {
        this.bounterId = bounterId;
    }

    @Column(name = "bounty_level", nullable = false)
    public String getBountyLevel() {
        return bountyLevel;
    }

    public void setBountyLevel(String bountyLevel) {
        this.bountyLevel = bountyLevel;
    }

    @Column(name = "bounty_amount", nullable = false)
    public Long getBountyAmount() {
        return bountyAmount;
    }

    public void setBountyAmount(Long bountyAmount) {
        this.bountyAmount = bountyAmount;
    }

    @Column(name = "create_time", nullable = false)
    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
