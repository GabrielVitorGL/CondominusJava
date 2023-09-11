package br.com.etechoracio.condominus.controller;

import br.com.etechoracio.condominus.entity.Apartamento;
import br.com.etechoracio.condominus.entity.Entrega;
import br.com.etechoracio.condominus.repository.ApartamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/apartamento")
public class ApartamentoController {

    @Autowired
    private ApartamentoRepository repository;

}
