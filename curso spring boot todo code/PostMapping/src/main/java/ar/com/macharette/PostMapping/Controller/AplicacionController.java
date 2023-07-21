package ar.com.macharette.PostMapping.Controller;
import  ar.com.macharette.PostMapping.Cliente;
import org.springframework.web.bind.annotation.*;
import  ar.com.macharette.PostMapping.Cliente;
import java.util.ArrayList;
import java.util.List;

@RestController
public class AplicacionController {
    //creacion de endpoint
    @PostMapping("/cliente")
    public void crearCliente( @RequestBody Cliente cliente){

        System.out.println("Cliente Creado");
        System.out.println("Nombre: " + cliente.getNombre());
        System.out.println("Apellido: " + cliente.getApellido());

    }
    @GetMapping("/cliente/traer")
    @ResponseBody
    public List <Cliente> traerClientes(){
        // Crear la lista de clientes
        List<Cliente> listaClientes = new ArrayList<Cliente>();

        // Agregar 10 clientes ficticios a la lista
        listaClientes.add(new Cliente(1L, "Juan", "Pérez"));
        listaClientes.add(new Cliente(2L, "María", "Gómez"));
        listaClientes.add(new Cliente(3L, "Luis", "Martínez"));
        listaClientes.add(new Cliente(4L, "Ana", "Rodríguez"));
        listaClientes.add(new Cliente(5L, "Pedro", "López"));
        listaClientes.add(new Cliente(6L, "Laura", "Fernández"));
        listaClientes.add(new Cliente(7L, "Carlos", "Sánchez"));
        listaClientes.add(new Cliente(8L, "Sofía", "Ramírez"));
        listaClientes.add(new Cliente(9L, "Alejandro", "García"));
        listaClientes.add(new Cliente(10L, "Valentina", "Hernández"));
        return  listaClientes;
    }
}
