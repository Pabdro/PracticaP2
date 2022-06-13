package ejr5;

public class Git {
    private Codigo state;

    public void setCommit(Codigo state){
        this.state=state;
    }

    public Memento createCommit(){
        return  new Memento(state);
    }

    public Codigo restoreCommit(Memento m){
        this.state= m.getState();
        return this.state;
    }

}