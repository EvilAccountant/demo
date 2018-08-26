-- auto Generated on 2018-08-24 15:32:40 
-- DROP TABLE IF EXISTS `bridge_site`; 
CREATE TABLE bridge_site(
    `id` BIGINT(20) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT 'id',
    `bridge_id` VARCHAR(50) NOT NULL DEFAULT '' COMMENT '����ID',
    `side_type` VARCHAR(50) NOT NULL DEFAULT '' COMMENT '�ַ�����',
    `site_no` INTEGER(12) NOT NULL DEFAULT -1 COMMENT '�׺�',
    `joint_no` INTEGER(12) NOT NULL DEFAULT -1 COMMENT '����',
    `span` INTEGER(12) NOT NULL DEFAULT -1 COMMENT '�羶',
    `member_count` INTEGER(12) NOT NULL DEFAULT -1 COMMENT 'memberCount',
    `disease_count` INTEGER(12) NOT NULL DEFAULT -1 COMMENT 'diseaseCount',
    `super_structure_type_name` VARCHAR(50) NOT NULL DEFAULT '' COMMENT 'superStructureTypeName',
    PRIMARY KEY (`id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT 'bridge_site';
