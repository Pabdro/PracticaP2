package ejr4;

import java.util.ArrayList;
import java.util.List;

public class Whatapp implements IComunicacion{
    List<Usuario> usuariochat = new ArrayList<>();

    public Whatapp addProfesionalChat(Usuario usuario){
        usuariochat.add(usuario);
        return this;
    }
    @Override
    public void send(String msg, Persona persona, List<Integer> listaPersonas) {
        Usuario emisor = (Usuario) persona;
        for(Integer numeroP:listaPersonas){
            for(Usuario usuario:usuariochat){
                if(numeroP != emisor.getNro()) {
                    if (numeroP == usuario.getNro()) {
                        usuario.received(msg);
                    }
                }
            }
        }
    }
}
