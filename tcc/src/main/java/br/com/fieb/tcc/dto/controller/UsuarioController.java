package br.com.fieb.tcc.dto.controller;

import br.com.fieb.tcc.dto.usuarioDto.CadastrarUsuarioDto;
import br.com.fieb.tcc.dto.usuarioDto.DetalhesUsuarioDto;
import br.com.fieb.tcc.model.Usuario;
import br.com.fieb.tcc.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public ResponseEntity<DetalhesUsuarioDto> cadastrarUsuario(@RequestBody CadastrarUsuarioDto usuarioDto, UriComponentsBuilder uriBuilder){
        var usuario = new Usuario(usuarioDto);
        usuarioRepository.save(usuario);
        var url = uriBuilder.path("usuario/{id}").buildAndExpand(usuario.getId()).toUri();
        return ResponseEntity.created(url).body(new DetalhesUsuarioDto(usuario));
    }
}
