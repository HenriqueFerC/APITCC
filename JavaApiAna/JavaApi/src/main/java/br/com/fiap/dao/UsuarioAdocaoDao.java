package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import br.com.fiap.model.UsuarioAdocao;

public class UsuarioAdocaoDao {
	
	private Connection conn;

	public UsuarioAdocaoDao(Connection conn) {
		this.conn = conn;
	}
	
	public void cadastrar(UsuarioAdocao usuario) throws SQLException {
		PreparedStatement stm = conn.prepareStatement("INSERT INTO TB_USUARIO_ADOCAO (id_usuario_adocao, nome_usuario, email_usuario, telefone_usuario, cidade_usuario, rua_usuario, estado_usuario) values(?, ?, ?, ?, ?, ?, ?)");
		stm.setInt(1, usuario.getId());
		stm.setString(2, usuario.getNome());
		stm.setString(3, usuario.getEmail());
		stm.setString(4, usuario.getTelefone());
		stm.setString(5, usuario.getCidade());
		stm.setString(6, usuario.getRua());
		stm.setString(7, usuario.getEstado());

		stm.executeUpdate();
	}

}
