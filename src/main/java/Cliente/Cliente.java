package Cliente;

import Dirección.Dirección;
import Llamada.Llamada;
import Tarifa.Tarifa;

import java.time.LocalDate;
import java.util.ArrayList;

public abstract class Cliente {

    private String nombre;
    private String nif;
    private String correo;
    private LocalDate fechaAlta;
    private ArrayList<Llamada> listaLlamadas;
    private Dirección dirección;
    private Tarifa tarifa;


    public Cliente(String nombre, String nif, String correo, int códigoPostal, String provincia, String población) {

        this.nombre = nombre;
        this.nif = nif;
        this.correo = correo;
        this.fechaAlta = LocalDate.now();
        this.listaLlamadas = new ArrayList<Llamada>();
        this.dirección = new Dirección(códigoPostal, provincia, población);
        this.tarifa = new Tarifa();

    }

    public Cliente() {
    }

    public void addLlamadas(Llamada llamada) {
        this.listaLlamadas.add(llamada);
    }

    public String getNif() {
        return nif;
    }
}

