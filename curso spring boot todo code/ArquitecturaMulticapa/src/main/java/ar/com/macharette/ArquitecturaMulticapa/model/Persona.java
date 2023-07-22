package ar.com.macharette.ArquitecturaMulticapa.model;

import lombok.Getter;
import lombok.Setter;

@Setter @Getter
public class Persona {
    private int id_Cliene;
    private String nombre;
    private String apellido;

    public Persona() {
    }

    public Persona(int id_Cliene, String nombre, String apellido) {
        this.id_Cliene = id_Cliene;
        this.nombre = nombre;
        this.apellido = apellido;
    }
}
