package br.com.fieb.tcc.model;

import br.com.fieb.tcc.dto.usuarioAdocaoDto.CadastrarUsuarioAdocaoDto;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "TB_USUARIO_ADOCAO")
public class UsuarioAdocao {

    @Id
    @GeneratedValue
    private Long id;

    private String nome;

    private String email;

    private String telefone;

    private String cidade;

    private String rua;

    private String estado;

    public UsuarioAdocao(CadastrarUsuarioAdocaoDto usuarioAdocaoDto) {
        nome = usuarioAdocaoDto.nome();
        email = usuarioAdocaoDto.email();
        telefone = usuarioAdocaoDto.telefone();
        cidade = usuarioAdocaoDto.cidade();
        rua = usuarioAdocaoDto.rua();
        estado = usuarioAdocaoDto.estado();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
