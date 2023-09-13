package br.com.etechoracio.condominus.repository;

import br.com.etechoracio.condominus.entity.Pessoa;
import br.com.etechoracio.condominus.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    @Query("select u.nome, p.nome_pessoa, u.email, u.dat_env_cod from Usuario as u inner join Pessoa as p on u.id_usuario = p.id_pessoa where id_apartamento_pessoa = 1;")
    List<Usuario> buscarUsuarios();
}
