package com.luna.springBoot_desde0;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

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

}
