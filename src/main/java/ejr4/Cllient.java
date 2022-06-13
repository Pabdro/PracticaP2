package ejr4;

import java.util.ArrayList;
import java.util.List;

public class Cllient {
    public static void main(String[] args) {
        Whatapp whatapp=new Whatapp();
        Usuario u1=new Usuario(whatapp);
        List<Integer> l1=new ArrayList<>();
        l1.add(1);
        l1.add(2);

        List<Integer> l2=new ArrayList<>();
        l2.add(1);
        l2.add(2);
        l2.add(3);
        l2.add(4);
        l2.add(5);
        l2.add(6);
        l2.add(7);
        l2.add(8);
        l2.add(9);
        l2.add(10);

        u1.setTipo("usuario1").setNro(1).setName("Raul");
        Usuario u2=new Usuario(whatapp);
        u2.setTipo("usuario2").setNro(2).setName("Sebas");
        Usuario u3=new Usuario(whatapp);
        u3.setTipo("usuario3").setNro(3).setName("Manuel");
        Usuario u4=new Usuario(whatapp);
        u4.setTipo("usuario4").setNro(4).setName("Rodrigo");
        Usuario u5=new Usuario(whatapp);
        u5.setTipo("usuario5").setNro(5).setName("Marcos");
        Usuario u6=new Usuario(whatapp);
        u6.setTipo("usuario6").setNro(6).setName("Rosita");
        Usuario u7=new Usuario(whatapp);
        u7.setTipo("usuario7").setNro(7).setName("Flavio");
        Usuario u8=new Usuario(whatapp);
        u8.setTipo("usuario8").setNro(8).setName("Antonela");
        Usuario u9=new Usuario(whatapp);
        u9.setTipo("usuario9").setNro(9).setName("Jose");
        Usuario u10=new Usuario(whatapp);
        u10.setTipo("usuario10").setNro(10).setName("Juan");

        whatapp.addProfesionalChat(u1).addProfesionalChat(u2).addProfesionalChat(u3)
                .addProfesionalChat(u4).addProfesionalChat(u5).addProfesionalChat(u6)
                .addProfesionalChat(u7).addProfesionalChat(u8).addProfesionalChat(u9)
                .addProfesionalChat(u10);

        u1.send("mensaje para Sebas", l1);
        System.out.println();
        u10.send("mensaje para el grupo", l2);
    }
}
