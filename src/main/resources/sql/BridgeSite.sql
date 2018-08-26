-- auto Generated on 2018-08-24 15:32:40 
-- DROP TABLE IF EXISTS `bridge_site`; 
CREATE TABLE bridge_site(
    `id` BIGINT(20) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT 'id',
    `bridge_id` VARCHAR(50) NOT NULL DEFAULT '' COMMENT 'ÇÅÁºID',
    `side_type` VARCHAR(50) NOT NULL DEFAULT '' COMMENT '·Ö·ùÀàÐÍ',
    `site_no` INTEGER(12) NOT NULL DEFAULT -1 COMMENT '¿×ºÅ',
    `joint_no` INTEGER(12) NOT NULL DEFAULT -1 COMMENT 'ÁªºÅ',
    `span` INTEGER(12) NOT NULL DEFAULT -1 COMMENT '¿ç¾¶',
    `member_count` INTEGER(12) NOT NULL DEFAULT -1 COMMENT 'memberCount',
    `disease_count` INTEGER(12) NOT NULL DEFAULT -1 COMMENT 'diseaseCount',
    `super_structure_type_name` VARCHAR(50) NOT NULL DEFAULT '' COMMENT 'superStructureTypeName',
    PRIMARY KEY (`id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT 'bridge_site';
