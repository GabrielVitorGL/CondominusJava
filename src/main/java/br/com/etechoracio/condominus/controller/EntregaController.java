package br.com.etechoracio.condominus.controller;

import br.com.etechoracio.condominus.entity.Condominio;
import br.com.etechoracio.condominus.entity.Entrega;
import br.com.etechoracio.condominus.repository.EntregaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/entrega")
public class EntregaController {

    @Autowired
    private EntregaRepository repository;

    @GetMapping
    public List<Entrega> buscarTodos(){
        return repository.findAll();
    }

    @GetMapping("/{Id}")
    public Optional<Entrega> buscarPorId(@PathVariable Long Id)
    {
        return repository.findById(Id);
    }

    @PostMapping
    public Entrega inserir(@RequestBody Entrega body) {
        Entrega Inserido = repository.save(body);
        return Inserido;
    }

    @PutMapping("/{id}")
    public Entrega atualizar(@RequestBody Entrega obj,@PathVariable Long id) {
        Optional<Entrega> existe = buscarPorId(id);
        if(existe.isPresent())
            repository.save(obj);
        return obj;
    }
}
