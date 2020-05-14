use `store`;

CREATE TABLE `customer` (
     `id` int auto_increment NOT NULL,
     `email` varchar(128) NOT NULL,
     `password` varchar(128) NOT NULL,
     `name` varchar(128) NOT NULL,
     `login` varchar(128) NOT NULL,
     `enabled` boolean NOT NULL default true,
     `role` varchar(16) NOT NULL default 'USER',
     PRIMARY KEY (`id`),
     UNIQUE INDEX `email_unique` (`email` ASC)
);
CREATE TABLE `store` (
                         `id` INT auto_increment NOT NULL PRIMARY KEY,
                         `name` varchar(128) NOT NULL,
                         `address` varchar(128) NOT NULL,
                         `image` varchar(128) NOT NULL,
                         `description` varchar(128) NOT NULL,
                         `product_id` INT NOT NULL
);

create table `product` (
                           `id` INT auto_increment NOT NULL PRIMARY KEY ,
                           `name` varchar(128) NOT NULL,
                           `image` varchar(128) NOT NULL,
                           `price` float not null,
                           `quantity` INT NOT NULL,
                           `type` varchar(128) NOT NULL
);
create table `order` (
                         `id` INT auto_increment NOT NULL PRIMARY KEY ,
                         `customer_id` int NOT NULL,
                         `store_id` int NOT NULL,
                         `product_id` int NOT NULL
);

insert into `product` (`name`, `image`, `price`, `quantity`, `type`) values ('Coffee', 'coffee.png', 200, 15, 'food'), ('Pizza', 'pizza.png', 315, 30, 'food');
insert into `store` (`name`, `image`, `address`, `description`) values ('Margarita', 'store1.png', 'Sovetskaya', 'Very good store'), ('Imperial', 'store2.png', 'Donetskaya', 'Best store');
