package com.luna.springBoot_desde0;

public class Producto {

    //Declaramos atributos
    private int id;
    private String nombre;
    private double precio;

    //constructor
    public Producto(int id, String nombre, double precio){
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
    }

    //gets
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }
}
