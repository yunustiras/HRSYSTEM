CREATE TABLE `Project` (
	`id` BINARY NOT NULL AUTO_INCREMENT,
	`name` VARCHAR(255) NOT NULL UNIQUE,
	`description` VARCHAR(255) NOT NULL,
	`manager_id` BINARY NOT NULL,
	`status` BOOLEAN NOT NULL,
	PRIMARY KEY (`id`)
);

CREATE TABLE `Employee` (
	`id` BINARY NOT NULL AUTO_INCREMENT,
	`name` VARCHAR(255) NOT NULL,
	`surname` VARCHAR(255) NOT NULL,
	`salary` FLOAT NOT NULL,
	`project_id` BINARY NOT NULL,
	`employee_type` BINARY NOT NULL,
	PRIMARY KEY (`id`)
);

CREATE TABLE `Employee-Type` (
	`id` BINARY NOT NULL AUTO_INCREMENT,
	`type` VARCHAR(255) NOT NULL UNIQUE,
	PRIMARY KEY (`id`)
);

ALTER TABLE `Project` ADD CONSTRAINT `Project_fk0` FOREIGN KEY (`manager_id`) REFERENCES `Employee`(`id`);

ALTER TABLE `Employee` ADD CONSTRAINT `Employee_fk0` FOREIGN KEY (`project_id`) REFERENCES `Project`(`id`);

ALTER TABLE `Employee` ADD CONSTRAINT `Employee_fk1` FOREIGN KEY (`employee_type`) REFERENCES `Employee-Type`(`id`);

