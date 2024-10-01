    package br.com.fiap.model;

import java.time.LocalDate;

public class UsuarioAdocao {
	
	private int id;
	private String nome;
	private String email;
    private String telefone;
    private String cidade;
    private String rua;
    private String estado;

    public UsuarioAdocao() {
    }

    public UsuarioAdocao(int id, String nome, String email, String telefone, String cidade, String rua, String estado) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.cidade = cidade;
        this.rua = rua;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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
