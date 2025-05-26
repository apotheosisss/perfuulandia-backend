package com.perfulandia.usuarioservice.service;
import com.perfulandia.usuarioservice.model.Usuario;
import com.perfulandia.usuarioservice.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UsuarioService {

    private final UsuarioRepository repo;

    public UsuarioService(UsuarioRepository repo) {
        this.repo = repo;
    }

    //Anotaciones o métodos para el CRUD

    public List<Usuario> listar() {
        return repo.findAll();
    }
    public Usuario guardar(Usuario usuario) {
        return repo.save(usuario);
    }

    //Buscar un usuario por su id
    public Usuario buscar(Long id) {
        return repo.findById(id).orElse(null);
    }

    //Eliminar un usuario
    public void eliminar(Long id) {
        repo.deleteById(id);
    }
}
