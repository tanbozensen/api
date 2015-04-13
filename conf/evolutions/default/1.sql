# --- Created by Slick DDL
# To stop Slick DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table "tanbo" ("id" BIGSERIAL NOT NULL PRIMARY KEY,"riceType" INTEGER,"phase" INTEGER NOT NULL,"doneDate" VARCHAR(254) NOT NULL,"latitude" DOUBLE PRECISION NOT NULL,"longitude" DOUBLE PRECISION NOT NULL);

# --- !Downs

drop table "tanbo";

