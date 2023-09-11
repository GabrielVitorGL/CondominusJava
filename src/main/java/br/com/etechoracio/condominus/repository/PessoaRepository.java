package br.com.etechoracio.condominus.repository;

import br.com.etechoracio.condominus.entity.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

}
