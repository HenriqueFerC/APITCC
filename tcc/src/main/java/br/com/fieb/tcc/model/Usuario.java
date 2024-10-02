package br.com.fieb.tcc.model;

import br.com.fieb.tcc.dto.usuarioDto.CadastrarUsuarioDto;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="TB_USUARIO")
public class Usuario {

    @Id
    @GeneratedValue
    private Long id;

    private String email;

    private String senha;


    public Usuario(CadastrarUsuarioDto usuarioDto) {
        email = usuarioDto.email();
        senha = usuarioDto.senha();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
