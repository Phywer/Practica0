package ListaClientes;

import Cliente.*;

import java.util.ArrayList;

public class ListaClientes {

    ArrayList<Cliente> clientesAlta=new ArrayList<Cliente>();
    ArrayList<Cliente> clientesBaja=new ArrayList<Cliente>();

    public void AltaClientes(Cliente cliente){
        clientesAlta.add(cliente);
    }

    public void BajaClientes(Cliente cliente){
        clientesAlta.remove(cliente);
        clientesBaja.add(cliente);
    }

    public Cliente BuscarNif (String Nif){
        for(Cliente cliente: clientesAlta){
           if(Nif.compareTo(cliente.getNif())==0) {
               return cliente;
           }
        }throw  new IllegalArgumentException();
    }
}
