package ar.com.macharette.ArquitecturaMulticapa.service;

import ar.com.macharette.ArquitecturaMulticapa.model.Alumno;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlumnoService implements IAlumnoService{
    @Override
    public void crearAlumno(Alumno alu) {
        System.out.println("Alumno creado satifactoriamente ");
    }

    @Override
    public List<Alumno> traerAlumno() {
        return null;
    }
}
