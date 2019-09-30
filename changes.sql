ALTER TABLE `klientai_keliones` ADD FOREIGN KEY (`klientai_id`) REFERENCES `klientai`(`id`) ON DELETE RESTRICT ON UPDATE RESTRICT;
ALTER TABLE `klientai_keliones` DROP FOREIGN KEY `klientai_keliones_ibfk_2`; 
ALTER TABLE `klientai_keliones` ADD CONSTRAINT `klientai_keliones_ibfk_2` FOREIGN KEY (`klientai_id`) REFERENCES `klientai`(`id`) ON DELETE CASCADE ON UPDATE CASCADE;
ALTER TABLE `klientai_keliones` ADD FOREIGN KEY (`keliones_id`) REFERENCES `keliones`(`id`) ON DELETE RESTRICT ON UPDATE RESTRICT;

ALTER TABLE `keliones` 
CHANGE `flag_poilsines` `flag_poilsines` TINYINT(3) UNSIGNED NULL DEFAULT NULL
, CHANGE `flag_pazintines` `flag_pazintines` TINYINT(3) UNSIGNED NULL DEFAULT NULL
, CHANGE `flag_viskas_isk` `flag_viskas_isk` TINYINT(3) UNSIGNED NULL DEFAULT NULL
, CHANGE `flag_laisv_pasir` `flag_laisv_pasir` TINYINT(3) UNSIGNED NULL DEFAULT NULL;

ALTER TABLE `klientai` DROP `apras`;

ALTER TABLE 
`klientai` CHANGE `flag_poilsines` `flag_poilsines` TINYINT(3) UNSIGNED NULL DEFAULT NULL
, CHANGE `flag_pazintines` `flag_pazintines` TINYINT(3) UNSIGNED NULL DEFAULT NULL
, CHANGE `flag_viskas_isk` `flag_viskas_isk` TINYINT(3) UNSIGNED NULL DEFAULT NULL
, CHANGE `flag_laisv_pasir` `flag_laisv_pasir` TINYINT(3) UNSIGNED NULL DEFAULT NULL;