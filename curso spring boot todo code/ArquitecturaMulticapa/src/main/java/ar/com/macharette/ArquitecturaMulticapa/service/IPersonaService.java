package ar.com.macharette.ArquitecturaMulticapa.service;

import ar.com.macharette.ArquitecturaMulticapa.model.Persona;

import java.util.List;

public interface IPersonaService {
    //se declarar los metodos sin implementar
    //interfaz para metodos abstractos
    //metodo abstracto para crear persona
    public void crearPersona(Persona per);
    ///metodo abstracto para traer lista de personas
    public List<Persona> traerPersona();
}
