package br.com.fieb.tcc.dto.controller;

import br.com.fieb.tcc.dto.usuarioAdocaoDto.CadastrarUsuarioAdocaoDto;
import br.com.fieb.tcc.dto.usuarioAdocaoDto.DetalhesUsuarioAdocaoDto;
import br.com.fieb.tcc.dto.usuarioDto.CadastrarUsuarioDto;
import br.com.fieb.tcc.dto.usuarioDto.DetalhesUsuarioDto;
import br.com.fieb.tcc.model.Usuario;
import br.com.fieb.tcc.model.UsuarioAdocao;
import br.com.fieb.tcc.repository.UsuarioAdocaoRepository;
import br.com.fieb.tcc.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping("/usuarioadocao")
public class UsuarioAdocaoController {

    @Autowired
    private UsuarioAdocaoRepository usuarioAdocaoRepository;

    public ResponseEntity<DetalhesUsuarioAdocaoDto> cadastrarUsuario(@RequestBody CadastrarUsuarioAdocaoDto usuarioDto, UriComponentsBuilder uriBuilder){
        var usuarioAdocao = new UsuarioAdocao(usuarioDto);
        usuarioAdocaoRepository.save(usuarioAdocao);
        var url = uriBuilder.path("usuarioadocao/{id}").buildAndExpand(usuarioAdocao.getId()).toUri();
        return ResponseEntity.created(url).body(new DetalhesUsuarioAdocaoDto(usuarioAdocao));
    }

}
