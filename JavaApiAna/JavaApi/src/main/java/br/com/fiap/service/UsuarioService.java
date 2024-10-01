package br.com.fiap.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.GregorianCalendar;
import java.util.List;

import br.com.fiap.model.UsuarioAdocao;
import br.com.fiap.dao.UsuarioAdocaoDao;
import br.com.fiap.factory.ConnectionFactory;

public class UsuarioService {
	
	private UsuarioAdocaoDao usuarioDao;
	
	public UsuarioService() throws ClassNotFoundException, SQLException {
		Connection conn = ConnectionFactory.getConnection();
		usuarioDao = new UsuarioAdocaoDao(conn);
	}
	
	public void cadastrar(UsuarioAdocao usuario) throws SQLException {
		usuarioDao.cadastrar(usuario);
	}
	
}	
