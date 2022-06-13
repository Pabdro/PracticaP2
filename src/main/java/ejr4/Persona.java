package ejr4;

import java.util.List;

public abstract class Persona {
    protected IComunicacion comunicacion;
    private String name;
    private String tipo;
    private int nro;

    public int getNro() {
        return nro;
    }

    public Persona setNro(int nro) {
        this.nro = nro;
        return this;
    }

    public Persona(IComunicacion comunicacion) {
        this.comunicacion = comunicacion;
    }

    public String getTipo() {
        return tipo;
    }

    public Persona setTipo(String tipo) {
        this.tipo = tipo;
        return this;
    }

    public String getName() {
        return name;
    }

    public Persona setName(String name) {
        this.name = name;
        return this;
    }

    public abstract void send(String msg, List<Integer> listaPersonas);
    public abstract void received(String msg);
}
