package br.com.etechoracio.condominus.controller;

import br.com.etechoracio.condominus.entity.Pessoa;
import br.com.etechoracio.condominus.entity.Reserva;
import br.com.etechoracio.condominus.entity.Usuario;
import br.com.etechoracio.condominus.repository.ReservaRepository;
import br.com.etechoracio.condominus.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioRepository repository;

    @GetMapping
    public List<Usuario> buscarTodos(){
        return repository.findAll();
    }

    @GetMapping("/{Id}")
    public Optional<Usuario> buscarPorId(@PathVariable Long Id)
    {
        return repository.findById(Id);
    }

    @PostMapping
    public Usuario inserir(@RequestBody Usuario body) {
        Usuario Inserido = repository.save(body);
        return Inserido;
    }

    @PutMapping("/{id}")
    public Usuario atualizar(@RequestBody Usuario obj,@PathVariable Long id) {
        Optional<Usuario> existe = buscarPorId(id);
        if(existe.isPresent())
            repository.save(obj);
        return obj;
    }

    @GetMapping("/moradores")
    public List<Usuario> buscarUsuarios() {
        return repository.buscarUsuarios();
    }
}
