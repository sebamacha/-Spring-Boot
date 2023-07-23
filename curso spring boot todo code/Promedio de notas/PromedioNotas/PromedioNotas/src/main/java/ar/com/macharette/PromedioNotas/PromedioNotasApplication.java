package ar.com.macharette.PromedioNotas;
/*Ejercicio Nº 1 – Promedio de Notas

Un alumno de secundaria desea poder contar con una API mediante la cual,
 al enviar las 3 notas de una materia obtenga como respuesta el promedio
 de la misma. Para el pasaje de notas como parámetro utilizar la annotation @RequestParam.*/
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("repository")
public class PromedioNotasApplication {

	public static void main(String[] args) {
		SpringApplication.run(PromedioNotasApplication.class, args);
	}

}
