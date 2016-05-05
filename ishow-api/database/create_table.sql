
DROP TABLE IF EXISTS is_article;
/**
 * 秀才文章作品表
 */
CREATE TABLE is_article (
  article_id          BIGINT(20) NOT NULL AUTO_INCREMENT COMMENT '作品ID，主键',
  author_id           BIGINT(20) NOT NULL COMMENT '作者ID',
  author_name         VARCHAR(12) not null COMMENT '作者名称/昵称',
  --
  title               VARCHAR(32) NOT NULL DEFAULT '' COMMENT '文章/作品标题',
  content             VARCHAR(120) NOT NULL COMMENT '文章/作品内容',
  image_url           VARCHAR(120)  COMMENT '作品图片URL',
  video_url           VARCHAR(120)  COMMENT '作品视频URL',
 --
  bounty1_total       INT NOT NULL DEFAULT 0 COMMENT '赏金级别1次数(铜赏.1分)',
  bounty2_total       INT NOT NULL DEFAULT 0 COMMENT '赏金级别2次数(银赏.1毛)',
  bounty3_total       INT NOT NULL DEFAULT 0 COMMENT '赏金级别3次数(金赏.1元)',
  bounty4_total       INT NOT NULL DEFAULT 0 COMMENT '赏金级别3次数(钻赏.10元)',
  bounty_amount       BIGINT NOT NULL DEFAULT 0 COMMENT '赏金总额(单位:分)',
  ban_flag            CHAR(1) NOT NULL DEFAULT '0' COMMENT '禁止标识(0:未禁止;1:禁止)',
  tip_off_total       INT NOT NULL DEFAULT 0 COMMENT '举报累计次数',
  --
  area_code           VARCHAR(6) COMMENT '区域代码',
  create_time         DATETIME NOT NULL COMMENT '作品创建时间',
  PRIMARY KEY (article_id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT '秀才文章作品表';

-- 作品评论表
CREATE TABLE  is_comment(
  comment_id          BIGINT(20) NOT NULL AUTO_INCREMENT COMMENT '评论ID，主键',
  article_id          BIGINT(20) NOT NULL COMMENT '作品ID',
  commenter_id        BIGINT(20) NOT NULL COMMENT '评论者ID',
  commenter_name      BIGINT(20) NOT NULL COMMENT '评论者名称',
  content             VARCHAR(120) NOT NULL COMMENT '评论内容',
  create_time         DATETIME NOT NULL COMMENT '创建时间',
  PRIMARY KEY (comment_id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT '作品评论表';

-- 赏金流水表
CREATE TABLE  is_bounty_flow(
  flow_id             BIGINT(20) NOT NULL AUTO_INCREMENT COMMENT '流水ID，主键',
  article_id          BIGINT(20) NOT NULL COMMENT '作品ID',
  author_id           BIGINT(20) NOT NULL COMMENT '作者ID',
  bounter_id          BIGINT(20) NOT NULL COMMENT '奖赏者ID',
  --
  bounty_level        CHAR(1) NOT NULL COMMENT '奖金级别(1:铜(板)，2:银(元)，3:金(币)，4:钻)',
  bounty_amount       BIGINT(20) NOT NULL COMMENT '奖赏金额(单位分)',
  --
  create_time         DATETIME NOT NULL COMMENT '创建时间',
  PRIMARY KEY (flow_id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT '作品评论表';