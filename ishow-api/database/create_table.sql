
DROP TABLE IF EXISTS is_article;
CREATE TABLE is_article (
  article_id bigint(20) NOT NULL AUTO_INCREMENT,
  author_id bigint(20) NOT NULL,
  author_name varchar(12) not null,
  title varchar(32) not null ,
  content varchar(120) not null ,
  PRIMARY KEY (article_id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8