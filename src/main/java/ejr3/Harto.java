package ejr3;


import java.util.List;

public class Harto implements IEstrategia{
    private int preciorequerido;

    public Harto(int preciorequerido) {
        this.preciorequerido = preciorequerido;
    }

    @Override
    public void execute(List<Celulares> tienda) {
        System.out.println("harto");
        for (Celulares celulares:tienda){
            if (tienda.size()>5){
                if (celulares.getPrecio()==preciorequerido) {
                    celulares.info();
                }
            }
        }
    }
}
