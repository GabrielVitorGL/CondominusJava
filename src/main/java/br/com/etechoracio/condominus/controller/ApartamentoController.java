package br.com.etechoracio.condominus.controller;

import br.com.etechoracio.condominus.entity.Apartamento;
import br.com.etechoracio.condominus.repository.ApartamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/apartamento")
public class ApartamentoController {

    @Autowired
    private ApartamentoRepository repository;

    @GetMapping
    public List<Apartamento> buscarTodos(){
        return repository.findAll();
    }

    @GetMapping("/{Id}")
    public Optional<Apartamento> buscarPorId(@PathVariable Long Id)
    {
        return repository.findById(Id);
    }

    @PostMapping
    public Apartamento inserir(@RequestBody Apartamento body) {
        Apartamento Inserido = repository.save(body);
        return Inserido;
    }

    @PutMapping("/{id}")
    public Apartamento atualizar(@RequestBody Apartamento obj, @PathVariable Long id) {
        Optional<Apartamento> existe = buscarPorId(id);
        if(existe.isPresent())
            repository.save(obj);
        return obj;
    }
}
