package ar.com.macharette.EjercicioRestaurant.Controlador;

import ar.com.macharette.EjercicioRestaurant.Modelo.Platos;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Controller {

    @GetMapping("/platos/elejir")
    @ResponseBody
    public List<Platos> elegirPlatos() {
        // Crear el ArrayList para almacenar los platos
        ArrayList<Platos> listaPlatos = new ArrayList<>();

        // Añadir 5 platos al ArrayList
        listaPlatos.add(new Platos(1, "Plato 1", 10, "Delicioso plato número 1"));
        listaPlatos.add(new Platos(2, "Plato 2", 15, "Exquisito plato número 2"));
        listaPlatos.add(new Platos(3, "Plato 3", 12, "Sabroso plato número 3"));
        listaPlatos.add(new Platos(4, "Plato 4", 18, "Increíble plato número 4"));
        listaPlatos.add(new Platos(5, "Plato 5", 25, "Delicioso plato número 5"));

        return listaPlatos;
    }
}
