package br.com.etechoracio.condominus.controller;

import br.com.etechoracio.condominus.entity.AreaComum;
import br.com.etechoracio.condominus.entity.Pessoa;
import br.com.etechoracio.condominus.repository.AreaComumRepository;
import br.com.etechoracio.condominus.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/pessoa")
public class PessoaController {

    @Autowired
    private PessoaRepository repository;

    @GetMapping
    public List<Pessoa> buscarTodos(){
        return repository.findAll();
    }

}
