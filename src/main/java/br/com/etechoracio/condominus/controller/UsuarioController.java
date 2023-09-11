package br.com.etechoracio.condominus.controller;

import br.com.etechoracio.condominus.entity.Reserva;
import br.com.etechoracio.condominus.entity.Usuario;
import br.com.etechoracio.condominus.repository.ReservaRepository;
import br.com.etechoracio.condominus.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioRepository repository;

    @GetMapping
    public List<Usuario> buscarTodos(){
        return repository.findAll();
    }
}
