package com.luna.springBoot_desde0;

import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController

//usando JSON
public class ProductoController {
    
    //endpoint dinamico usando variable
    @GetMapping("/producto/{id}")
    //objeto de tipo Producto
    public Producto producto(@PathVariable int id){

        //LOGICA
        if(id==1){
            return new Producto(1, "Laptop", 2500.00);
        }else{
            return new Producto(2, "Mouse", 800.00);
        }
        
    }

    //LISTA DE OBJETOS
    @GetMapping("/productos")
    public List<Producto> productos(){

        List<Producto> productos = new ArrayList<>();

        productos.add(new Producto(1, "Laptop", 2500.00));
        productos.add(new Producto(2, "Mouse", 80.00));
        productos.add(new Producto(3, "Teclado", 120.00));

        return productos;

    }
}
