package br.com.etechoracio.condominus.repository;

import br.com.etechoracio.condominus.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
