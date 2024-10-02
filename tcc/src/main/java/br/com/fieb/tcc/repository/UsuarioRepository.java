package br.com.fieb.tcc.repository;

import br.com.fieb.tcc.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
