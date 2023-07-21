package ar.com.macharette.EjercicioRestaurant.Modelo;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Platos {

    private int numPlato;
    private String nombre;
    private int precio;
    private String descripcion;

    public Platos() {
    }

    public Platos(int numPlato, String nombre, int precio, String descripcion) {
        this.numPlato = numPlato;
        this.nombre = nombre;
        this.precio = precio;
        this.descripcion = descripcion;
    }
}