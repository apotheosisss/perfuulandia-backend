package com.perfulandia.pedidoservice.service;
import com.perfulandia.pedidoservice.model.Pedido;
import com.perfulandia.pedidoservice.repository.PedidoRepository;

import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class PedidoService {
    private final PedidoRepository repo;
    public PedidoService(PedidoRepository repo) {
        this.repo = repo;
    }

    //Listar
    public List<Pedido> listar(){
        return repo.findAll();
    }
    //Guardar
    public Pedido guardar(Pedido pedido){
        return repo.save(pedido);
    }

    //Buscar
    public Pedido buscar(Long id){
        return repo.findById(id).orElse(null);
    }
    //Eliminar
    public void eliminar(Long id){
        repo.deleteById(id);
    }
}
