
CREATE TABLE is_article (
  article_id bigint(20) NOT NULL AUTO_INCREMENT,
  title varchar(32) not null ,
  content varchar(120) not null ,
  PRIMARY KEY (article_id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8