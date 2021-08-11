package org.generation.blogPessoal.repository;

import java.util.Optional;

import org.generation.blogPessoal.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

/* Este Usuario do nome do atributo é o mesmo Usuario que foi 
 * atributo da model. 
 * 
 * */

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	public Optional<Usuario> findByUsuario(String usuario); 
	
}
