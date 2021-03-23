USE `whitecollar`;

DROP TABLE IF EXISTS `Shop`;

CREATE TABLE IF NOT EXISTS `Shop` (
  `shop_id` BIGINT PRIMARY KEY  AUTO_INCREMENT,
  `shop_name` VARCHAR(45) NOT NULL,
  `shop_capacity` INT NOT NULL);

DROP TABLE IF EXISTS `Picture`;

CREATE TABLE IF NOT EXISTS `Picture` (
  `picture_id` BIGINT PRIMARY KEY AUTO_INCREMENT,
  `picture_name` VARCHAR(55) NOT NULL,
  `picture_author` VARCHAR(45) NOT NULL,
  `picture_date` DATE NOT NULL,
  `picture_price` DOUBLE NOT NULL,
  `shop_id` BIGINT NOT NULL);
  
ALTER TABLE Picture
ADD constraint FK_SHOP_ID  FOREIGN KEY (shop_id) 
      REFERENCES Shop (shop_id);
