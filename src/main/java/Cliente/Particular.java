package Cliente;

import Cliente.Cliente;

public class Particular extends Cliente {

    private String apellidos;

    public Particular(String nombre, String nif, String correo, int códigoPostal, String provincia, String población, String apellidos){
        super(nombre, nif,correo , códigoPostal, provincia, población);
        this.apellidos=apellidos;
    }


    public Particular() {
    }
}
