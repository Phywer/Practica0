package Cliente;

import Cliente.Cliente;

public class Empresa extends Cliente {

    public Empresa(String nombre, String nif, String correo, int códigoPostal, String provincia, String población){
        super(nombre, nif,correo , códigoPostal, provincia, población);
    }

    public Empresa() {
    }

}
