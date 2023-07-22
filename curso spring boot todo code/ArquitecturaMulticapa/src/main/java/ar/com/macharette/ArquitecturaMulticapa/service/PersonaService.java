package ar.com.macharette.ArquitecturaMulticapa.service;

import ar.com.macharette.ArquitecturaMulticapa.model.Persona;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaService implements IPersonaService {
    //traer las metodos implementados
    @Override
    public void crearPersona(Persona per) {
        //logica de la creacion
        System.out.println("Persona creada");

    }

    @Override
    public List<Persona> traerPersona() {
        //deberia de devolver la logica de persona, toda la logica iria aca
        return null;
    }
    //aca van todos los metodos de la logica de cliente
}
