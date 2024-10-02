package br.com.fieb.tcc.dto.usuarioAdocaoDto;

import br.com.fieb.tcc.model.UsuarioAdocao;

public record DetalhesUsuarioAdocaoDto(String nome, String email, String telefone, String cidade, String rua, String estado) {
    public DetalhesUsuarioAdocaoDto(UsuarioAdocao usuarioAdocao){
        this(usuarioAdocao.getNome(), usuarioAdocao.getEmail(), usuarioAdocao.getTelefone(), usuarioAdocao.getCidade(), usuarioAdocao.getRua(), usuarioAdocao.getEstado());
    }
}
