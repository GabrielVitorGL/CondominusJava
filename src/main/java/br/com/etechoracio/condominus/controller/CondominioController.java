package br.com.etechoracio.condominus.controller;

import br.com.etechoracio.condominus.entity.Condominio;
import br.com.etechoracio.condominus.repository.ApartamentoRepository;
import br.com.etechoracio.condominus.repository.CondominioRepository;
import br.com.etechoracio.condominus.repository.EntregaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/condominio")
public class CondominioController {
    @Autowired
    private CondominioRepository repository;

    @GetMapping
    public List<Condominio> buscarTodos(){
        return repository.findAll();
    }

    @GetMapping("/{Id}")
    public Optional<Condominio> buscarPorId(@PathVariable Long Id)
    {
        return repository.findById(Id);
    }

    @PostMapping
    public Condominio inserir(@RequestBody Condominio body) {
        Condominio Inserido = repository.save(body);
        return Inserido;
    }

    @PutMapping("/{id}")
    public Condominio atualizar(@RequestBody Condominio obj,@PathVariable Long id) {
        Optional<Condominio> existe = buscarPorId(id);
        if(existe.isPresent())
            repository.save(obj);
        return obj;
    }
}
