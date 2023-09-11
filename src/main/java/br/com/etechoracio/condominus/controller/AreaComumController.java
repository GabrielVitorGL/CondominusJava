package br.com.etechoracio.condominus.controller;

import br.com.etechoracio.condominus.entity.AreaComum;
import br.com.etechoracio.condominus.repository.ApartamentoRepository;
import br.com.etechoracio.condominus.repository.AreaComumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/areacomum")
public class AreaComumController {

    @Autowired
    private AreaComumRepository repository;

    @GetMapping
    public List<AreaComum> buscarTodos(){
        return repository.findAll();
    }
}
