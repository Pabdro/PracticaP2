package ejr1;

public class Originator {
    private Estudiante state;

    public Memento createMmemento() {
        return new Memento(state);
    }

    public void setMmemento(Estudiante state) {
        this.state = state;
    }

    public Estudiante restoreMemento(Memento m) {
        System.out.println("restaurando");
        this.state=m.getState();
        return this.state;
    }
}
