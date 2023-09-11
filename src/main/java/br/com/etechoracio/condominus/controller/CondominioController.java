package br.com.etechoracio.condominus.controller;

import br.com.etechoracio.condominus.entity.Condominio;
import br.com.etechoracio.condominus.repository.ApartamentoRepository;
import br.com.etechoracio.condominus.repository.CondominioRepository;
import br.com.etechoracio.condominus.repository.EntregaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("/condominio")
public class CondominioController {
    @Autowired
    private CondominioRepository repository;

    @GetMapping
    public List<Condominio> buscarTodos(){
        return repository.findAll();
    }
}
