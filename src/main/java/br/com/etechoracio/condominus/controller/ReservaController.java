package br.com.etechoracio.condominus.controller;

import br.com.etechoracio.condominus.entity.AreaComum;
import br.com.etechoracio.condominus.entity.Reserva;
import br.com.etechoracio.condominus.repository.AreaComumRepository;
import br.com.etechoracio.condominus.repository.ReservaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("/reserva")
public class ReservaController {

    @Autowired
    private ReservaRepository repository;

    @GetMapping
    public List<Reserva> buscarTodos(){
        return repository.findAll();
    }
}
