package com.luna.springBoot_desde0;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController 
public class HolaController {

    //peticion /hola - ejecutar metodo hola - usando una variable
    @GetMapping("/hola/{nombre}")
    public String hola(@PathVariable String nombre){
        //imprime Hola mundo
        return "Hola " + nombre;
    }

    //peticion usando parametro de consulta
    @GetMapping("/saludo")
    public String saludo(@RequestParam String nombre){
        return "Hola " + nombre;
    }

    @GetMapping("/suma")
    public String suma(@RequestParam int numero1, @RequestParam int numero2){
        return "La suma es: " + (numero1 + numero2);
    }
    
}
