package com.perfulandia.usuarioservice.controller;


import com.perfulandia.usuarioservice.model.Usuario;

import com.perfulandia.usuarioservice.service.UsuarioService;

import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {

    private final UsuarioService service;

    public UsuarioController(UsuarioService service) {
        this.service = service;
    }

    @GetMapping
    public List<Usuario> listar() {
        return service.listar();
    }

    @PostMapping
    public Usuario guardar(@RequestBody Usuario usuario) {
        return service.guardar(usuario);
    }

    @GetMapping
    public Usuario buscar(@PathVariable long id) {
        return service.buscar(id);
    }

    @DeleteMapping
    public void eliminar(@PathVariable long id) {
        service.eliminar(id);
    }
}
