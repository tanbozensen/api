# --- !Ups
ALTER TABLE "tanbo" ADD COLUMN "areaUnderTillage" DOUBLE PRECISION DEFAULT NULL;

# --- !Downs

ALTER TABLE  "tanbo" DROP COLUMN "areaUnderTillage";