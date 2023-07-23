package ar.com.macharette.PromedioNotas.model;

import lombok.Getter;
import lombok.Setter;

@Setter @Getter
public class Notas {

    private Double notaUno;
    private Double notaDos;
    private Double notaTres;

    public Notas() {
    }

    public Notas(Double notaUno, Double notaDos, Double notaTres) {
        this.notaUno = notaUno;
        this.notaDos = notaDos;
        this.notaTres = notaTres;
    }
}
