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