package com.luna.springBoot_desde0;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PutMapping;

@RestController

//usando JSON
public class ProductoController {

    //constante de tipo ProductoService 
    private final ProductoService productoService;

    //CONSTRUCTOR
    public ProductoController(ProductoService productoService){
        this.productoService = productoService;
    }

    //NUEVO GET QUE TRABAJA CON LA CLASE SERVICE
    @GetMapping("/productos")
    public List<Producto> productos(){
        return productoService.obtenerProductos();
    }

    //NUEVO ENDPOINT PARA EL METODO2
    @GetMapping("/producto/{id}")
    public Producto producto(@PathVariable int id){
        return productoService.obtenerProductoPorID(id);
    }

    //ENPOINT PARA EL METODO3
    @GetMapping("/producto/nombre/{nombre}")
    public Producto producto(@PathVariable String nombre){
        return productoService.obtenerProductoPorNombre(nombre);
    }

    //PRIMER POST
    @PostMapping("/productos")
    public Producto crearProducto(@RequestBody Producto producto){
        return productoService.crearProducto(producto);
    }

    //PRIMER DELETE
    @DeleteMapping("/productos/{id}")
    public void eliminarProducto(@PathVariable int id){
        productoService.eliminarProducto(id);
    }

    //PRIMER PUT
    @PutMapping("/productos/{id}")
    public Producto actualizarProducto(@PathVariable int id, @RequestBody Producto producto){
        return productoService.actualizarProducto(id, producto);
    }

}
