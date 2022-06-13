package ejr6;


import java.util.ArrayList;
import java.util.List;

public class TorreDeComunicacion implements IComunicacion {
    List<Desarrollador> usuariochat = new ArrayList<>();

    public TorreDeComunicacion addProfesionalChat(Desarrollador usuario){
        usuariochat.add(usuario);
        return this;
    }
    @Override
    public void send(String msg, Persona persona, List<Integer> listaPersonas) {
        Desarrollador emisor = (Desarrollador) persona;
        for(Integer numeroP:listaPersonas){
            for(Desarrollador usuario:usuariochat){
                if(numeroP != emisor.getNro()) {
                    if (numeroP == usuario.getNro()) {
                        usuario.received(msg);
                    }
                }
            }
        }
    }
}
