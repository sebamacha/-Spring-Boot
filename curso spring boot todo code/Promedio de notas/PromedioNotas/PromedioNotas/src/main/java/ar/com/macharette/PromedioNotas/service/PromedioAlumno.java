package repository;

import ar.com.macharette.PromedioNotas.service.PromedioAlumno;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface IPromedioNotasRepository {

    List<PromedioAlumno> mostrarTodos();
    Double calcularPromedio(String nombre); // Nuevo método para calcular el promedio de notas para un alumno
}
// ... (código anterior)

@Repository
public class PromedioNotasRepository implements IPromedioNotasRepository {

    // ... (código anterior)

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
