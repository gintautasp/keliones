ALTER TABLE `klientai_keliones` ADD FOREIGN KEY (`klientai_id`) REFERENCES `klientai`(`id`) ON DELETE RESTRICT ON UPDATE RESTRICT;
ALTER TABLE `klientai_keliones` DROP FOREIGN KEY `klientai_keliones_ibfk_2`; 
ALTER TABLE `klientai_keliones` ADD CONSTRAINT `klientai_keliones_ibfk_2` FOREIGN KEY (`klientai_id`) REFERENCES `klientai`(`id`) ON DELETE CASCADE ON UPDATE CASCADE;
ALTER TABLE `klientai_keliones` ADD FOREIGN KEY (`keliones_id`) REFERENCES `keliones`(`id`) ON DELETE RESTRICT ON UPDATE RESTRICT;
