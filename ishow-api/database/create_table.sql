
DROP TABLE IF EXISTS is_article;
/**
 * 秀才文章作品表
 */
CREATE TABLE is_article (
  article_id          BIGINT(20) NOT NULL AUTO_INCREMENT,
  author_id           BIGINT(20) NOT NULL COMMENT '作者ID',
  author_name         VARCHAR(12) not null COMMENT '作者名称/昵称',
  title               VARCHAR(32) NOT NULL DEFAULT '' COMMENT '文章/作品标题',
  content             VARCHAR(120) NOT NULL COMMENT '文章/作品内容',
  image_url           VARCHAR(120) NOT NULL COMMENT '作品图片URL',
  video_url           VARCHAR(120) NOT NULL COMMENT '作品视频URL',
  create_time         DATETIME NOT NULL COMMENT '文章创建时间',
  bounty1_total       INT NOT NULL DEFAULT 0 COMMENT '赏金级别1次数(铜赏)',
  bounty2_total       INT NOT NULL DEFAULT 0 COMMENT '赏金级别2次数(银赏)',
  bounty3_total       INT NOT NULL DEFAULT 0 COMMENT '赏金级别3次数(金赏)',
  bounty_amount       BIGINT NOT NULL DEFAULT 0 COMMENT '赏金总额(单位:分)',
  ban_flag            CHAR(1) NOT NULL DEFAULT '0' COMMENT '禁止标识(0:未禁止;1:禁止)',
  tip_off_total       INT NOT NULL DEFAULT 0 COMMENT '举报累计次数',
  PRIMARY KEY (article_id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT '秀才文章作品表';