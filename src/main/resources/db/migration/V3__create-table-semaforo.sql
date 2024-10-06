CREATE SEQUENCE SEQ_SEMAFOROS
    START WITH 1
    INCREMENT BY 1 NOCACHE
    NOCYCLE;

CREATE TABLE TBL_SEMAFOROS
(
    SEMAFORO_ID INTEGER DEFAULT SEQ_SEMAFOROS.NEXTVAL NOT NULL,
    ESTADO       VARCHAR2(100) NOT NULL,
    DURACAO     INTEGER NOT NULL,
    LUGAR      VARCHAR2(100) NOT NULL,
    FUNCIONANDO NUMBER(1,0) NOT NULL
);