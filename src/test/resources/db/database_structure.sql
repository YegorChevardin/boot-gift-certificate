-- -----------------------------------------------------
-- Table `gift_certificates`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `gift_certificates`;

CREATE TABLE IF NOT EXISTS `gift_certificates`
(
    `id`               INT UNSIGNED NOT NULL AUTO_INCREMENT,
    `name`             VARCHAR(45)  NOT NULL,
    `description`      TEXT(500)    NULL,
    `price`            FLOAT        NOT NULL,
    `duration`         INT          NOT NULL,
    `create_date`      TIMESTAMP    NOT NULL,
    `last_update_date` TIMESTAMP    NOT NULL,
    PRIMARY KEY (`id`),
    UNIQUE INDEX `id_UNIQUE` (`id` ASC) VISIBLE,
    UNIQUE INDEX `name_UNIQUE` (`name` ASC) VISIBLE
)


-- -----------------------------------------------------
-- Table `tags`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `tags`;

CREATE TABLE IF NOT EXISTS `tags`
(
    `id`    INT UNSIGNED NOT NULL AUTO_INCREMENT,
    `value` VARCHAR(45)  NOT NULL,
    PRIMARY KEY (`id`),
    UNIQUE INDEX `id_UNIQUE` (`id` ASC) VISIBLE,
    UNIQUE INDEX `name_UNIQUE` (`value` ASC) VISIBLE
)


-- -----------------------------------------------------
-- Table `gift_certificates_tags`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `gift_certificates_tags`;

CREATE TABLE IF NOT EXISTS `gift_certificates_tags`
(
    `gift_certificate_id` INT UNSIGNED NOT NULL,
    `tag_id`              INT UNSIGNED NOT NULL,
)


-- -----------------------------------------------------
-- Table `users`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `users`;

CREATE TABLE IF NOT EXISTS `users`
(
    `id`       INT UNSIGNED NOT NULL AUTO_INCREMENT,
    `username` VARCHAR(50)  NOT NULL,
    PRIMARY KEY (`id`),
    UNIQUE INDEX `id_UNIQUE` (`id` ASC) VISIBLE,
    UNIQUE INDEX `username_UNIQUE` (`username` ASC) VISIBLE
)


-- -----------------------------------------------------
-- Table `orders`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `orders`;

CREATE TABLE IF NOT EXISTS `orders`
(
    `id`           INT UNSIGNED   NOT NULL AUTO_INCREMENT,
    `user_id`      INT UNSIGNED   NOT NULL,
    `cost`         FLOAT UNSIGNED NOT NULL,
    `purchased_at` TIMESTAMP      NULL DEFAULT CURRENT_TIMESTAMP,
    PRIMARY KEY (`id`),
    UNIQUE INDEX `id_UNIQUE` (`id` ASC) VISIBLE,
)

-- -----------------------------------------------------
-- Table `orders_gift_certificates`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `orders_gift_certificates`;

CREATE TABLE IF NOT EXISTS `orders_gift_certificates`
(
    `order_id`            INT UNSIGNED NOT NULL,
    `gift_certificate_id` INT UNSIGNED NOT NULL,
    INDEX `fk_orders_gift_certificates_orders1_idx` (`order_id` ASC) VISIBLE,
    INDEX `fk_orders_gift_certificates_gift_certificates1_idx` (`gift_certificate_id` ASC) VISIBLE,
    CONSTRAINT `fk_orders_gift_certificates_orders1`
    FOREIGN KEY (`order_id`)
    REFERENCES `orders` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
    CONSTRAINT `fk_orders_gift_certificates_gift_certificates1`
    FOREIGN KEY (`gift_certificate_id`)
    REFERENCES `gift_certificates` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION
)
