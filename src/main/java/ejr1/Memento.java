package ejr1;

public class Memento {
    private Estudiante state;

    public Memento(Estudiante state) {
        this.state = state;
    }

    public Estudiante getState() {
        return state;
    }
}
