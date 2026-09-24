# Spring-Boot
GET - obtener informacion
POST - enviar informacion 

@RestController -> indica que la clase se encargará de recibir y repsonder solicitudes HTTP

@Service -> indica que la clase contiene lógica de negocio

              Spring Boot
                   │
                   ↓
               Controller
                   │
                   ↓
                Service
                   │
                   ↓
             Lista de datos


@GetMapping("/ ") -> peticion que ejecuta un método

@PathVariable -> /{variable}) @PathVaribale String variable 

ejem: @GetMapping("/hola/{nombre}")
    public String hola(@PathVariable String nombre){
        return "Hola " + nombre;
    }

@RequestParam -> parametro de consulta - ejem: saludo?nombre=Luna
@GetMapping("/saludo")
    public String saludo(@RequestParam String nombre){
        return "Hola " + nombre;
    }

@RequestBody -> convierte JSON en objeto
@PostMapping("/productos")
    public Producto crearProducto(@RequestBody Producto producto){
        return producto;
    }


LISTASS
-importar librerias import java.util.ArrayList; import java.util.List;
-crear la lista de objetos
List<Producto> productos = new ArrayList<>();

-agregar objetos a la lista
productos.add(new Producto(1, "Laptop", 2500.00));

-tamaño de la lists
productos.size();

-obtener un elemento
productos.get(0);

-eliminar un elemento
productos.remove(1);

comparar String -> producto.getNombre().equals(nombre)

