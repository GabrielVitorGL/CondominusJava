package br.com.etechoracio.condominus.controller;

import br.com.etechoracio.condominus.entity.AreaComum;
import br.com.etechoracio.condominus.entity.Pessoa;
import br.com.etechoracio.condominus.repository.AreaComumRepository;
import br.com.etechoracio.condominus.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/pessoa")
public class PessoaController {

    @Autowired
    private PessoaRepository repository;

    @GetMapping
    public List<Pessoa> buscarTodos(){
        return repository.findAll();
    }

    @GetMapping("/{Id}")
    public Optional<Pessoa> buscarPorId(@PathVariable Long Id)
    {
        return repository.findById(Id);
    }

    @PostMapping
    public Pessoa inserir(@RequestBody Pessoa body) {
        Pessoa Inserido = repository.save(body);
        return Inserido;
    }

    @PutMapping("/{id}")
    public Pessoa atualizar(@RequestBody Pessoa obj,@PathVariable Long id) {
        Optional<Pessoa> existe = buscarPorId(id);
        if(existe.isPresent())
            repository.save(obj);
        return obj;
    }

    @GetMapping("/moradores")
    public List<Pessoa> buscarMoradores() {
        return repository.buscarMoradores();
    }
}
