package ar.com.macharette.PromedioNotas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import repository.PromedioNotasRepository;


@RestController
public class PromedioController {

    private final PromedioNotasRepository promedioNotasRepository;

    @Autowired
    public PromedioController(PromedioNotasRepository promedioNotasRepository) {
        this.promedioNotasRepository = promedioNotasRepository;
    }

    @GetMapping("/calcularPromedio")
    public Double calcularPromedio(@RequestParam("nombre") String nombre) {
        return promedioNotasRepository.calcularPromedio(nombre);
    }
}
