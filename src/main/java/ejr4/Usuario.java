package ejr4;

import java.util.List;

public class Usuario extends Persona {
    public Usuario(IComunicacion comunicacion) {
        super(comunicacion);
    }



    @Override
    public void send(String msg, List<Integer> listaPersonas) {
        comunicacion.send(msg,this, listaPersonas);
    }

    @Override
    public void received(String msg) {
        System.out.println("INFO> name: "+getName()+ " nro: "+getNro()+ " tipo: "+getTipo());
        System.out.println("INFO> received "+msg);
    }
}
