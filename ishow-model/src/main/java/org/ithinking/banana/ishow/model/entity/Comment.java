package org.ithinking.banana.ishow.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * 作品评价
 *
 * @author fuchujian
 * @since 2016-04-29
 */
@Entity
@Table(name = "is_comment")
public class Comment {
    private Long commentId;
    // 作品ID
    private Long articleId;
    // 评论者ID
    private Long commenterId;
    // 评论者名称
    private String commenterName;
    // 评论内容
    private String content;
    // 创建时间
    private Date createTime;

    @Id
    @Column(name = "comment_id", nullable = false)
    public Long getCommentId() {
        return commentId;
    }

    public void setCommentId(Long commentId) {
        this.commentId = commentId;
    }

    @Column(name = "article_id", nullable = false)
    public Long getArticleId() {
        return articleId;
    }

    public void setArticleId(Long articleId) {
        this.articleId = articleId;
    }

    @Column(name = "commenter_id", nullable = false)
    public Long getCommenterId() {
        return commenterId;
    }

    public void setCommenterId(Long commenterId) {
        this.commenterId = commenterId;
    }

    @Column(name = "commenter_name", nullable = false)
    public String getCommenterName() {
        return commenterName;
    }

    public void setCommenterName(String commenterName) {
        this.commenterName = commenterName;
    }

    @Column(name = "content", nullable = false)
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Column(name = "create_time", nullable = false)
    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
