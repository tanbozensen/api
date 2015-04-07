# Users スキーマ
 
# --- !Ups
CREATE TABLE locale (
    id  bigserial primary key,
    latitude int NOT NULL,
    longitude int NOT NULL
);
 
CREATE TABLE tanbo (
    id  bigserial PRIMARY KEY,
    locale_id  bigint references locale(id),
    liceType int NOT NULL,
    phase int NOT NULL,
    doneDate date NOT NULL
);
 
# --- !Downs
 
DROP TABLE locale;
DROP TABLE tanbo;