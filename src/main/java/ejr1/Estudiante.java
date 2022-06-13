package ejr1;

import java.util.List;

public class Estudiante {
    private List<Tesis> tesis;

    public Estudiante(List<Tesis> tesis) {
        this.tesis = tesis;
    }

    public List<Tesis> getTesis() {
        return tesis;
    }

    public void setTesis(List<Tesis> tesis) {
        this.tesis = tesis;
    }
    public void showInfo(){
        System.out.println("informacion de la tesis");
        for (int i=0;i<tesis.size();i++){
            tesis.get(i).showInfo();
        }
    }
}
