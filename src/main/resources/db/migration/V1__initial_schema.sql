<<<<<<< HEAD
=======

>>>>>>> master
CREATE TABLE IF NOT EXISTS s4h.providers
(id VARCHAR(36),
`name` VARCHAR(100) NOT NULL,
price FLOAT DEFAULT 0,
supplier_id VARCHAR(36),
PRIMARY KEY (id));
