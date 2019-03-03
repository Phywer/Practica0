package Llamada;

import java.time.LocalDate;

public class Llamada {

    private double numLlamada;
    private LocalDate fecha;
    private int minsDuracion;


    public Llamada(double numLlamada, int minsDuracion) {

        this.fecha = LocalDate.now();
        this.numLlamada = numLlamada;
        this.minsDuracion = minsDuracion;

    }

}
