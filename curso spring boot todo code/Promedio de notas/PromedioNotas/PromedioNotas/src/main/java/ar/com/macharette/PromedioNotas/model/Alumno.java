package ar.com.macharette.PromedioNotas.model;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Alumno {
    private String nombre;
    private String apellido;
    private Notas notas;

    public Alumno() {
    }

    public Alumno(String nombre, String apellido, Notas notas) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.notas = notas;
    }
}


