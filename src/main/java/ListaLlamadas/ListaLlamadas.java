package ListaLlamadas;

import Cliente.*;
import Llamada.Llamada;

public class ListaLlamadas {

    Cliente cliente= new Particular();

    public void AñadirLlamada(double numLlamada, int minsDuracion) {
        Llamada llamada = new Llamada(numLlamada, minsDuracion);
        cliente.addLlamadas(llamada);

    }

}
