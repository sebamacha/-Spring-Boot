package repository;

import ar.com.macharette.PromedioNotas.service.PromedioAlumno;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PromedioNotasRepository implements IPromedioNotasRepository {

    @Override
    public List<PromedioAlumno> mostrarTodos() {
        // Aquí, simularemos la lista de 4 alumnos con sus notas y promedio.
        List<PromedioAlumno> alumnos = new ArrayList<>();

        // Alumno 1
        PromedioAlumno alumno1 = new PromedioAlumno();
        alumno1.setNombre("Juan");
        alumno1.setApellido("Perez");
        alumno1.setNotaUno(7.5);
        alumno1.setNotaDos(8.0);
        alumno1.setNotaTres(6.5);
        alumnos.add(alumno1);

        // Alumno 2
        PromedioAlumno alumno2 = new PromedioAlumno();
        alumno2.setNombre("Maria");
        alumno2.setApellido("Gomez");
        alumno2.setNotaUno(9.0);
        alumno2.setNotaDos(8.5);
        alumno2.setNotaTres(7.0);
        alumnos.add(alumno2);

        // Alumno 3
        PromedioAlumno alumno3 = new PromedioAlumno();
        alumno3.setNombre("Pedro");
        alumno3.setApellido("Lopez");
        alumno3.setNotaUno(6.0);
        alumno3.setNotaDos(7.0);
        alumno3.setNotaTres(7.5);
        alumnos.add(alumno3);

        // Alumno 4
        PromedioAlumno alumno4 = new PromedioAlumno();
        alumno4.setNombre("Ana");
        alumno4.setApellido("Martinez");
        alumno4.setNotaUno(8.0);
        alumno4.setNotaDos(7.5);
        alumno4.setNotaTres(8.5);
        alumnos.add(alumno4);

        return alumnos;
    }
    @Override
    public Double calcularPromedio(String nombre) {
        // Buscar al alumno por nombre
        for (PromedioAlumno alumno : mostrarTodos()) {
            if (alumno.getNombre().equalsIgnoreCase(nombre)) {
                // Calcular el promedio para el alumno encontrado
                return (alumno.getNotaUno() + alumno.getNotaDos() + alumno.getNotaTres()) / 3.0;
            }
        }
        // Si no se encuentra al alumno, devolver null o algún valor por defecto
        return null;
    }
}