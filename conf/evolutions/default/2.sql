# --- !Ups
ALTER TABLE "tanbo" ADD COLUMN areaUnderTillage "longitude" DOUBLE PRECISION DEFAULT NULL;

# --- !Downs

ALTER TABLE  "tanbo" DELETE COLUMN areaUnderTillage;