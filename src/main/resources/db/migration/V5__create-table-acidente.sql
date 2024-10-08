CREATE SEQUENCE SEQ_ACIDENTES
    START WITH 1
    INCREMENT BY 1 NOCACHE
    NOCYCLE;

CREATE TABLE TBL_ACIDENTES
(
    ACIDENTE_ID INTEGER DEFAULT SEQ_ACIDENTES.NEXTVAL NOT NULL,
    DESCRICAO       VARCHAR2(100) NOT NULL,
    SEVERIDADE      VARCHAR(100) NOT NULL,
    DIA     DATE NOT NULL,
    LUGAR   VARCHAR(100) NOT NULL
);