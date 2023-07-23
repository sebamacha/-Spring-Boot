package repository;

import ar.com.macharette.PromedioNotas.service.PromedioAlumno;

import java.util.List;

public interface IPromedioNotasRepository {
    List<PromedioAlumno> mostrarTodos();
    Double calcularPromedio(String nombre); // Nuevo método para calcular el promedio de notas para un alumno
}
