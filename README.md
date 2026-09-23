# Spring-Boot

@RestController -> indica que la clase se encargará de recibir y repsonder solicitudes HTTP

@GetMapping("/ ") -> peticion que ejecuta un método

@PathVariable -> /{variable}) @PathVaribale String variable 

ejem: @GetMapping("/hola/{nombre}")
    public String hola(@PathVariable String nombre){
        return "Hola " + nombre;
    }

@RequestParam -> parametro de consulta - ejem: saludo?nombre=Luna