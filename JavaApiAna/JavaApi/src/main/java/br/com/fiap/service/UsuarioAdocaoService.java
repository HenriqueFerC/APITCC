package br.com.fiap.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.fiap.dao.UsuarioAdocaoDao;
import br.com.fiap.exceptions.BadInfoException;
import br.com.fiap.exceptions.IdNotFoundException;
import br.com.fiap.factory.ConnectionFactory;
import br.com.fiap.model.UsuarioAdocao;

public class UsuarioAdocaoService {
	
	private UsuarioAdocaoDao usuarioAdocaoDao;
	
	public UsuarioAdocaoService() throws ClassNotFoundException, SQLException {
		Connection conn = ConnectionFactory.getConnection();
		usuarioAdocaoDao = new UsuarioAdocaoDao(conn);
	}
	
	public void cadastrar(UsuarioAdocao usuario) throws SQLException, BadInfoException {
		usuarioAdocaoDao.cadastrar(usuario);
	}
}
