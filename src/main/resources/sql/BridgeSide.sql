-- auto Generated on 2018-08-22 16:43:42 
-- DROP TABLE IF EXISTS `bridge_side`; 
CREATE TABLE tbl_bridge_side(
    `id` VARCHAR(50) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT 'id',
    `bridge_name` VARCHAR(50) NOT NULL DEFAULT '' COMMENT '桥梁名称',
    `bridge_id` VARCHAR(50) NOT NULL DEFAULT '' COMMENT '桥梁ID',
    `side_type` VARCHAR(50) NOT NULL DEFAULT '' COMMENT '分幅类型（参数表）',
    `side_type_name` VARCHAR(50) NOT NULL DEFAULT '' COMMENT '分幅名称',
    `bridge_length` INTEGER(12) NOT NULL DEFAULT -1 COMMENT '桥梁全长（毫米）',
    `max_span` DECIMAL(14,4) NOT NULL DEFAULT 0 COMMENT '最大跨径（毫米）',
    `span_comb` VARCHAR(50) NOT NULL DEFAULT '' COMMENT '跨径组合',
    `up_clear_height` INTEGER(12) NOT NULL DEFAULT -1 COMMENT '桥上净高(毫米)',
    `super_structure_type_name` VARCHAR(50) NOT NULL DEFAULT '' COMMENT 'superStructureTypeName',
    PRIMARY KEY (`id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT 'bridge_side';
