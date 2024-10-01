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

Código de conexão com o SQL Server

package br.com.fiap.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    private static final String URL = "jdbc:sqlserver://sqlserver.fiap.com.br:1433;databaseName=SeuBancoDeDados";
    private static final String USER = "rm552325";
    private static final String PASSWORD = "170904";

    public static Connection getConnection() throws SQLException, ClassNotFoundException {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
 
