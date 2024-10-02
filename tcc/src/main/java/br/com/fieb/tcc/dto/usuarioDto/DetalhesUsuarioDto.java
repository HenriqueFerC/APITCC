package br.com.fieb.tcc.dto.usuarioDto;

import br.com.fieb.tcc.model.Usuario;

public record DetalhesUsuarioDto(String email, String senha) {
    public DetalhesUsuarioDto(Usuario usuario){
        this(usuario.getEmail(), usuario.getSenha());
    }
}
