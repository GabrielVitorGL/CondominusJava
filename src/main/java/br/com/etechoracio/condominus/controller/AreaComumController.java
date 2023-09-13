package br.com.etechoracio.condominus.controller;

import br.com.etechoracio.condominus.entity.AreaComum;
import br.com.etechoracio.condominus.repository.ApartamentoRepository;
import br.com.etechoracio.condominus.repository.AreaComumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/areacomum")
public class AreaComumController {

    @Autowired
    private AreaComumRepository repository;

    @GetMapping
    public List<AreaComum> buscarTodos(){
        return repository.findAll();
    }

    @GetMapping("/{Id}")
    public Optional<AreaComum> buscarPorId(@PathVariable Long Id)
    {
        return repository.findById(Id);
    }

    @PostMapping
    public AreaComum inserir(@RequestBody AreaComum body) {
        AreaComum Inserido = repository.save(body);
        return Inserido;
    }

    @PutMapping("/{id}")
    public AreaComum atualizar(@RequestBody AreaComum obj,@PathVariable Long id) {
        Optional<AreaComum> existe = buscarPorId(id);
        if(existe.isPresent())
            repository.save(obj);
        return obj;
    }
}
