--1. SINGLE TABLE HIERARCHY
CREATE TABLE `single_table_employee` (
	`id` BIGINT(10) NOT NULL AUTO_INCREMENT,
	`name` VARCHAR(50) NULL DEFAULT NULL,
	`type` VARCHAR(50) NULL DEFAULT NULL,
	`salary` FLOAT,
	`bonus` INT,
    `pay_per_hour` FLOAT,
    `contract_period` VARCHAR(50),
	PRIMARY KEY (`id`)
);

--2. TABLE_PER_CLASS - JOINED
CREATE TABLE `tbs_user` (
	`id` BIGINT(10) NOT NULL AUTO_INCREMENT,
	`username` VARCHAR(50) NULL DEFAULT NULL,
    `password` VARCHAR(50) NULL DEFAULT NULL,
	PRIMARY KEY (`id`)
);

CREATE TABLE `tbs_admin` (
	`user_id` BIGINT(10) NOT NULL AUTO_INCREMENT,
	`name` VARCHAR(50) NULL DEFAULT NULL,
    FOREIGN KEY (`user_id`) references tbs_user(`id`)
);

CREATE TABLE `tbs_customer` (
	`user_id` BIGINT(10) NOT NULL AUTO_INCREMENT,
	`name` VARCHAR(50) NULL DEFAULT NULL,
    `mobile_number` varchar(50) null default null,
    FOREIGN KEY (`user_id`) references tbs_user(`id`)
);