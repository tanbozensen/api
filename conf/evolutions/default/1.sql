# --- !Ups

create table "tanbo" ("id" BIGSERIAL NOT NULL PRIMARY KEY,"riceType" INTEGER,"phase" INTEGER NOT NULL,"doneDate" VARCHAR(254) NOT NULL,"latitude" DOUBLE PRECISION NOT NULL,"longitude" DOUBLE PRECISION NOT NULL);

# --- !Downs

drop table "tanbo";

