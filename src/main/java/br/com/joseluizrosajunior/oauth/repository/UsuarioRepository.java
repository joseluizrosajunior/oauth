package br.com.joseluizrosajunior.oauth.repository;

import br.com.joseluizrosajunior.oauth.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	
	Optional<Usuario> findByEmail(String email);

}
