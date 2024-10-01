CREATE TABLE TB_USUARIO_ADOCAO (

    id_usuario_adocao   NUMBER PRIMARY KEY,

    nome_usuario        VARCHAR2(256) NOT NULL,

    email_usuario       VARCHAR2(256) NOT NULL,

    telefone_usuario    VARCHAR2(256) NOT NULL,

    cidade_usuario      VARCHAR2(256) NOT NULL,

    rua_usuario         VARCHAR2(256) NOT NULL,

    estado_usuario      VARCHAR2(256) NOT NULL

);

 
CREATE TABLE TB_USUARIO (

    id_usuario       NUMBER PRIMARY KEY,

    email_usuario    VARCHAR2(256) NOT NULL,

    senha_usuario    VARCHAR2(256) NOT NULL

);

 
