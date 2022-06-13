package ejr5;

public class Memento {
    private Codigo state;

    public Memento(Codigo codigo){
        state=codigo;
    }

    public Codigo getState() {
        return state;
    }
}
