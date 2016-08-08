--------------------------------------------------------
-- Archivo creado  - domingo-agosto-07-2016   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Table BANCOS
--------------------------------------------------------

  CREATE TABLE "PRUEBAS"."BANCOS" 
   (	"IDBANCO" NUMBER(5,0), 
	"SBANCO" VARCHAR2(50 CHAR)
   ) ;
--------------------------------------------------------
--  DDL for Table LOGIN
--------------------------------------------------------

  CREATE TABLE "PRUEBAS"."LOGIN" 
   (	"IDUSUARIO" NUMBER(5,0), 
	"SUSUARIO" VARCHAR2(20 CHAR), 
	"SPASSWORD" VARCHAR2(100 CHAR), 
	"DEFCHAEXPIRA" DATE
   ) ;
REM INSERTING into PRUEBAS.BANCOS
SET DEFINE OFF;
REM INSERTING into PRUEBAS.LOGIN
SET DEFINE OFF;
--------------------------------------------------------
--  DDL for Index BANOS_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "PRUEBAS"."BANOS_PK" ON "PRUEBAS"."BANCOS" ("IDBANCO") 
  ;
--------------------------------------------------------
--  DDL for Index LOGIN_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "PRUEBAS"."LOGIN_PK" ON "PRUEBAS"."LOGIN" ("IDUSUARIO") 
  ;
--------------------------------------------------------
--  Constraints for Table BANCOS
--------------------------------------------------------

  ALTER TABLE "PRUEBAS"."BANCOS" ADD CONSTRAINT "BANOS_PK" PRIMARY KEY ("IDBANCO") ENABLE;
  ALTER TABLE "PRUEBAS"."BANCOS" MODIFY ("SBANCO" NOT NULL ENABLE);
  ALTER TABLE "PRUEBAS"."BANCOS" MODIFY ("IDBANCO" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table LOGIN
--------------------------------------------------------

  ALTER TABLE "PRUEBAS"."LOGIN" MODIFY ("DEFCHAEXPIRA" NOT NULL ENABLE);
  ALTER TABLE "PRUEBAS"."LOGIN" ADD CONSTRAINT "LOGIN_PK" PRIMARY KEY ("IDUSUARIO") ENABLE;
  ALTER TABLE "PRUEBAS"."LOGIN" MODIFY ("SPASSWORD" NOT NULL ENABLE);
  ALTER TABLE "PRUEBAS"."LOGIN" MODIFY ("SUSUARIO" NOT NULL ENABLE);
  ALTER TABLE "PRUEBAS"."LOGIN" MODIFY ("IDUSUARIO" NOT NULL ENABLE);
