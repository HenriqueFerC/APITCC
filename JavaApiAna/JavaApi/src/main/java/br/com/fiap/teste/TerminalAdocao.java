package br.com.fiap.teste;

import java.sql.Connection;
import java.time.LocalDate;
import java.util.List;

import br.com.fiap.dao.UsuarioAdocaoDao;
import br.com.fiap.factory.ConnectionFactory;
import br.com.fiap.model.UsuarioAdocao;


public class TerminalAdocao {
	public static void main(String[] args) {
		UsuarioAdocao usuario = new UsuarioAdocao(1, "Henrique Cardoso", "henrique@hotmail.com", "11949494949", "Barueri", "Rua Carolina", "São Paulo");
		Connection conn = null;
		try {
			conn = ConnectionFactory.getConnection();
			UsuarioAdocaoDao dao = new UsuarioAdocaoDao(conn);
			dao.cadastrar(usuario);
			System.out.println("Gravado!");
		} catch (Exception e) {
			System.err.println((e.getMessage()));
		} finally {
			try {
				if(conn != null) {
					conn.close();
				}
			} catch (Exception e2) {
			}
	
		}}
}