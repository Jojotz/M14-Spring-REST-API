INSERT INTO `Shop` (shop_id, shop_name, shop_capacity) 
VALUES
  	(NULL,'Jacaranda', '30'),
  	(NULL,'Munchkin', '50');

INSERT INTO 
	`Picture` (picture_id,picture_name, picture_author, picture_date, picture_price, shop_id) 
VALUES
  	(NULL,'Malvas Rojas', 'Federico Lorca', '2021-03-17', '500.25', '1'),
  	(NULL,'Red Indians', 'Paul Goguin','2021-03-17', '1400.95', '2'),
  	(NULL,'El Grito', 'Karl Munch', '2021-03-17', '1600.88', '1'),
  	(NULL,'Los girasoles', 'Vincent Van Gogh', '2021-03-17', '2000.0', '2');