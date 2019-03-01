package Factura;

import Tarifa.Tarifa;

import java.time.LocalDate;

public class Factura {

    private String códigoFactura;
    private Tarifa precio;
    private LocalDate emisión;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private float importe;

    public Factura(String códigoFactura, LocalDate fechaInicio, LocalDate fechaFin){

        this.códigoFactura = códigoFactura;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.emisión = LocalDate.now();

    }

}
