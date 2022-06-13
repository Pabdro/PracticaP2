package ejr1;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        Caretaker caretaker=new Caretaker();
        Originator originator=new Originator();
        Estudiante tesis;
        List<Tesis> tesis1=new ArrayList<>();
        tesis1.add(new Tesis("estado1"));
        tesis=new Estudiante(tesis1);

        List<Tesis> tesis2=new ArrayList<>();
        tesis2.add(new Tesis("estado2"));
        tesis=new Estudiante(tesis2);

        List<Tesis> tesis3=new ArrayList<>();
        tesis3.add(new Tesis("estado3"));
        tesis=new Estudiante(tesis3);
        originator.setMmemento(tesis);
        caretaker.createTesis("tutor", originator.createMmemento());
        List<Tesis> tesis4=new ArrayList<>();
        tesis4.add(new Tesis("estado4"));
        tesis=new Estudiante(tesis4);

        List<Tesis> tesis5=new ArrayList<>();
        tesis5.add(new Tesis("estado5"));
        tesis=new Estudiante(tesis5);
        tesis.showInfo();
        System.out.println("********");
        tesis=originator.restoreMemento(caretaker.getTesis("tutor"));
        tesis.showInfo();
    }
}
