package com.perfulandia.pedidoservice.controller;
import com.perfulandia.pedidoservice.model.Pedido;
import com.perfulandia.pedidoservice.service.PedidoService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/pedidos")
public class PedidoController {

    private final PedidoService servicio;
    public PedidoController(PedidoService servicio) {
        this.servicio = servicio;
    }
    //Listar
    @GetMapping
    public List<Pedido> listar() {
        return servicio.listar();
    }

    @PostMapping
    public Pedido guardar(@RequestBody Pedido pedido) {
        return servicio.guardar(pedido);
    }
    @GetMapping("/{id}")
    public Pedido buscar(@PathVariable long id) {
        return servicio.buscar(id);
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable long id) {
        servicio.eliminar(id);
    }
}
