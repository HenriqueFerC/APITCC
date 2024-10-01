package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import br.com.fiap.model.Usuario;
import br.com.fiap.exceptions.IdNotFoundException;

public class UsuarioDao {
	
	public Connection conn;

	public UsuarioDao(Connection conn) {
		this.conn = conn;
	}

	public void cadastrar(Usuario usuario) throws SQLException{
		PreparedStatement stm = conn.prepareStatement("INSERT INTO TB_USUARIO (id_usuario, email_usuario, senha_usuario) values (?, ?, ?)");
		stm.setInt(1, usuario.getId());
		stm.setString(2, usuario.getEmail());
		stm.setString(3, usuario.getSenha());
		
		stm.executeUpdate();
	}
}
