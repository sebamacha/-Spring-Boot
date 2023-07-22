package ar.com.macharette.ArquitecturaMulticapa.service;

import ar.com.macharette.ArquitecturaMulticapa.model.Alumno;
import ar.com.macharette.ArquitecturaMulticapa.model.Persona;

import java.util.List;

public interface IAlumnoService {

    //se declarar los metodos sin implementar
    //interfaz para metodos abstractos
    //metodo abstracto para crear persona
    public void crearAlumno(Alumno alu);
    ///metodo abstracto para traer lista de personas
    public List<Alumno> traerAlumno();
}
