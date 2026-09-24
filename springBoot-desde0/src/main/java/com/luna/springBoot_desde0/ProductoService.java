package com.luna.springBoot_desde0;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service 
public class ProductoService {

    //LISTA GENERAL
    private List<Producto> productos = new ArrayList<>();

    //CONSTRUCTOR?
    public ProductoService(){
        productos.add(new Producto(1, "Laptop", 2500.00));
        productos.add(new Producto(2, "Mouse", 80.00));
        productos.add(new Producto(3, "Teclado", 120.00));
    }
    
    //METODO 1
    public List<Producto> obtenerProductos(){
        return productos;
    }

    //METODO 2
    public Producto obtenerProductoPorID(int id){

        for (Producto producto : productos) {
            if (producto.getId() == id) {
            return producto;
            }
        }
        return null;
    }

    //METODO3
    public Producto obtenerProductoPorNombre(String nombre){

        //RECORREMOS COMPARANDO NOMBRE
        for(Producto producto : productos){
            if(producto.getNombre().equals(nombre)){
                return producto;
            }
        }
        return null;
    }

    //METODO PARA EL POST
    public Producto crearProducto(Producto producto){
        productos.add(producto);

        return producto;
    }
}
