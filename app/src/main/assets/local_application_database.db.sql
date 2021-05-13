BEGIN TRANSACTION;
CREATE TABLE IF NOT EXISTS "country_table" (
	"countryID"	TEXT NOT NULL,
	"countryName"	TEXT NOT NULL,
	PRIMARY KEY("countryID")
);
CREATE TABLE IF NOT EXISTS "language_table" (
	"languageID"	TEXT NOT NULL,
	"languageName"	TEXT NOT NULL,
	PRIMARY KEY("languageID")
);
CREATE TABLE IF NOT EXISTS "country_language_table" (
	"countryID"	TEXT NOT NULL,
	"languageID"	TEXT NOT NULL,
	PRIMARY KEY("languageID","countryID")
);
INSERT INTO "country_table" VALUES ('au','Austria');
INSERT INTO "country_table" VALUES ('be','Belgium');
INSERT INTO "country_table" VALUES ('bu','Bulgaria');
INSERT INTO "country_table" VALUES ('cr','Croatia');
INSERT INTO "country_table" VALUES ('cy','Cyprus');
INSERT INTO "country_table" VALUES ('cz','Czechia');
INSERT INTO "country_table" VALUES ('dk','Denmark');
INSERT INTO "country_table" VALUES ('es','Estonia');
INSERT INTO "country_table" VALUES ('fi','Finland');
INSERT INTO "country_table" VALUES ('fr','France');
INSERT INTO "country_table" VALUES ('ge','Germany');
INSERT INTO "country_table" VALUES ('gr','Greece');
INSERT INTO "country_table" VALUES ('hu','Hungary');
INSERT INTO "country_table" VALUES ('ir','Ireland');
INSERT INTO "country_table" VALUES ('it','Italy');
INSERT INTO "country_table" VALUES ('la','Latvia');
INSERT INTO "country_table" VALUES ('li','Lithuania');
INSERT INTO "country_table" VALUES ('lu','Luxembourg');
INSERT INTO "country_table" VALUES ('ma','Malta');
INSERT INTO "country_table" VALUES ('ne','Netherlands');
INSERT INTO "country_table" VALUES ('po','Poland');
INSERT INTO "country_table" VALUES ('pt','Portugal');
INSERT INTO "country_table" VALUES ('ro','Romania');
INSERT INTO "country_table" VALUES ('sk','Slovakia');
INSERT INTO "country_table" VALUES ('sl','Slovenia');
INSERT INTO "country_table" VALUES ('sp','Spain');
INSERT INTO "country_table" VALUES ('sw','Sweden');
INSERT INTO "language_table" VALUES ('bu','Bulgarian');
INSERT INTO "language_table" VALUES ('cr','Croatian');
INSERT INTO "language_table" VALUES ('cz','Czech');
INSERT INTO "language_table" VALUES ('da','Danish');
INSERT INTO "language_table" VALUES ('du','Dutch');
INSERT INTO "language_table" VALUES ('en','English');
INSERT INTO "language_table" VALUES ('es','Estonian');
INSERT INTO "language_table" VALUES ('fi','Finnish');
INSERT INTO "language_table" VALUES ('fr','French');
INSERT INTO "language_table" VALUES ('ge','German');
INSERT INTO "language_table" VALUES ('gr','Greek');
INSERT INTO "language_table" VALUES ('hu','Hungarian');
INSERT INTO "language_table" VALUES ('ir','Irish');
INSERT INTO "language_table" VALUES ('it','Italian');
INSERT INTO "language_table" VALUES ('la','Latvian');
INSERT INTO "language_table" VALUES ('li','Lithuanian');
INSERT INTO "language_table" VALUES ('lu','Luxembourguish');
INSERT INTO "language_table" VALUES ('ma','Maltese');
INSERT INTO "language_table" VALUES ('po','Polish');
INSERT INTO "language_table" VALUES ('pt','Portuguese');
INSERT INTO "language_table" VALUES ('ro','Romanian');
INSERT INTO "language_table" VALUES ('sk','Slovak');
INSERT INTO "language_table" VALUES ('sl','Slovene');
INSERT INTO "language_table" VALUES ('sp','Spanish');
INSERT INTO "language_table" VALUES ('sw','Swedish');
INSERT INTO "country_language_table" VALUES ('au','ge');
INSERT INTO "country_language_table" VALUES ('be','du');
INSERT INTO "country_language_table" VALUES ('be','fr');
INSERT INTO "country_language_table" VALUES ('be','ge');
INSERT INTO "country_language_table" VALUES ('bu','bu');
INSERT INTO "country_language_table" VALUES ('cr','cr');
INSERT INTO "country_language_table" VALUES ('cy','gr');
INSERT INTO "country_language_table" VALUES ('dk','de');
INSERT INTO "country_language_table" VALUES ('es','es');
INSERT INTO "country_language_table" VALUES ('fi','fi');
INSERT INTO "country_language_table" VALUES ('fr','fr');
INSERT INTO "country_language_table" VALUES ('ge','ge');
INSERT INTO "country_language_table" VALUES ('gr','gr');
INSERT INTO "country_language_table" VALUES ('hu','hu');
INSERT INTO "country_language_table" VALUES ('ir','fr');
INSERT INTO "country_language_table" VALUES ('it','it');
INSERT INTO "country_language_table" VALUES ('la','la');
INSERT INTO "country_language_table" VALUES ('li','li');
INSERT INTO "country_language_table" VALUES ('lu','fr');
INSERT INTO "country_language_table" VALUES ('lu','lu');
INSERT INTO "country_language_table" VALUES ('lu','ge');
INSERT INTO "country_language_table" VALUES ('ma','ma');
INSERT INTO "country_language_table" VALUES ('ne','du');
INSERT INTO "country_language_table" VALUES ('po','po');
INSERT INTO "country_language_table" VALUES ('pt','pt');
INSERT INTO "country_language_table" VALUES ('ro','ro');
INSERT INTO "country_language_table" VALUES ('sk','sk');
INSERT INTO "country_language_table" VALUES ('sl','sl');
INSERT INTO "country_language_table" VALUES ('sp','sp');
INSERT INTO "country_language_table" VALUES ('sw','sw');
COMMIT;
