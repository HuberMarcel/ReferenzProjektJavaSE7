CREATE TABLE `Mensch` (
  `id` int unsigned NOT NULL AUTO_INCREMENT,
  `geburtsname` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `familienname` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `vorname` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `zweitname` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `geburtsdatum` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
#  `email` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
#  `passwort` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
#  `vorname` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
#  `nachname` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `updated_at` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`)#, UNIQUE (`email`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;