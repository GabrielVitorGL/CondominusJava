package br.com.etechoracio.condominus.repository;

import br.com.etechoracio.condominus.entity.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

    @Query("SELECT p FROM Pessoa p WHERE p.perfil_pessoa = 'MORADOR'")
    List<Pessoa> buscarMoradores();
}
