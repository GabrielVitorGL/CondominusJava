package br.com.etechoracio.condominus.controller;

import br.com.etechoracio.condominus.entity.AreaComum;
import br.com.etechoracio.condominus.entity.Reserva;
import br.com.etechoracio.condominus.repository.AreaComumRepository;
import br.com.etechoracio.condominus.repository.ReservaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/reserva")
public class ReservaController {

    @Autowired
    private ReservaRepository repository;

    @GetMapping
    public List<Reserva> buscarTodos(){
        return repository.findAll();
    }

    @GetMapping("/{Id}")
    public Optional<Reserva> buscarPorId(@PathVariable Long Id)
    {
        return repository.findById(Id);
    }

    @PostMapping
    public Reserva inserir(@RequestBody Reserva body) {
        Reserva Inserido = repository.save(body);
        return Inserido;
    }

    @PutMapping("/{id}")
    public Reserva atualizar(@RequestBody Reserva obj,@PathVariable Long id) {
        Optional<Reserva> existe = buscarPorId(id);
        if(existe.isPresent())
            repository.save(obj);
        return obj;
    }
}
