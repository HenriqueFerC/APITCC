package br.com.fiap.teste;

import java.sql.Connection;
import java.time.LocalDate;
import java.util.List;

import br.com.fiap.dao.UsuarioDao;
import br.com.fiap.factory.ConnectionFactory;
import br.com.fiap.model.Usuario;


public class Terminal {
	public static void main(String[] args) {
		Usuario usuario = new Usuario(1, "henrique@hotmail.com", "eugostodepudim");
		Connection conn = null;
		try {
			conn = ConnectionFactory.getConnection();
			UsuarioDao dao = new UsuarioDao(conn);
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
