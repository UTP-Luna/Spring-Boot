package com.luna.springBoot_desde0;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service 
public class ProductoService {
    
    //METODO 1
    public List<Producto> obtenerProductos(){

        List<Producto> productos = new ArrayList<>();

        productos.add(new Producto(1, "Laptop", 2500.00));
        productos.add(new Producto(2, "Mouse", 80.00));
        productos.add(new Producto(3, "Teclado", 120.00));

        return productos;
    }

    //METODO 2
    public Producto obtenerProductoPorID(int id){

        List<Producto> productos = new ArrayList<>();

        productos.add(new Producto(1, "Laptop", 2500.00));
        productos.add(new Producto(2, "Mouse", 80.00));
        productos.add(new Producto(3, "Teclado", 120.00));

        for (Producto producto : productos) {
            if (producto.getId() == id) {
            return producto;
            }
        }
        return null;
    }

    //METODO3
    public Producto obtenerProductoPorNombre(String nombre){

        //CREAMOS LA LISTA DE OBJETOS
        List<Producto> productos = new ArrayList<>();
        
        //agregamos objetos
        productos.add(new Producto(1, "Laptop", 2500.00));
        productos.add(new Producto(2, "Mouse", 80.00));

        //RECORREMOS COMPARANDO NOMBRE
        for(Producto producto : productos){
            if(producto.getNombre().equals(nombre)){
                return producto;
            }
        }
        return null;
    }
}
