package ejr4;

import java.util.List;

public interface IComunicacion {
    void send(String msg, Persona persona, List<Integer> listaPersonas);
}
