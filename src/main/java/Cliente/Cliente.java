package Cliente;

import Dirección.Dirección;
import Llamada.Llamada;
import Tarifa.Tarifa;

import java.time.LocalDate;
import java.util.ArrayList;

abstract class Cliente {

    private String nombre;
    private String nif;
    private String correo;
    private LocalDate fechaAlta;

    private ArrayList<Llamada> listaLlamadas;

    private Dirección dirección;
    private Tarifa tarifa;


    public Cliente(String nombre, String nif, String correo, int códigoPostal, String provincia, String población, String dirección) {

        this.nombre = nombre;
        this.nif = nif;
        this.correo = correo;
        this.fechaAlta = LocalDate.now();
        this.listaLlamadas = new ArrayList<Llamada>();
        this.dirección = new Dirección(códigoPostal, provincia, población, dirección);
        this.tarifa = new Tarifa();

    }
}