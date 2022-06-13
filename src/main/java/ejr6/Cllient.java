package ejr6;

import java.util.ArrayList;
import java.util.List;

public class Cllient {
    public static void main(String[] args) {
        TorreDeComunicacion torreDeComunicacion=new TorreDeComunicacion();
        Desarrollador u1=new Desarrollador(torreDeComunicacion);
        List<Integer> l1=new ArrayList<>();
        l1.add(1);
        l1.add(3);

        List<Integer> l2=new ArrayList<>();
        l2.add(1);
        l2.add(2);
        l2.add(3);
        l2.add(4);
        l2.add(5);

        u1.setTipo("ayudante").setNro(1).setName("Raul");
        Desarrollador u2=new Desarrollador(torreDeComunicacion);
        u2.setTipo("junior").setNro(2).setName("Sebas");
        Desarrollador u3=new Desarrollador(torreDeComunicacion);
        u3.setTipo("experto").setNro(3).setName("Manuel");
        Desarrollador u4=new Desarrollador(torreDeComunicacion);
        u4.setTipo("master").setNro(4).setName("Rodrigo");
        Desarrollador u5=new Desarrollador(torreDeComunicacion);
        u5.setTipo("pasante").setNro(5).setName("Marcos");

        torreDeComunicacion.addProfesionalChat(u1).addProfesionalChat(u2).addProfesionalChat(u3)
                .addProfesionalChat(u4).addProfesionalChat(u5);
        u1.send("no se programar en esta computadora, ayuda!", l1);
        System.out.println();
        u5.send("ya me retiro, ya termine mi parte del codigo, voy a subir mi codigo", l2);
    }
}
