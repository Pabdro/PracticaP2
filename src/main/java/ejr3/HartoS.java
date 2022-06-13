package ejr3;


import java.util.List;

public class HartoS implements IEstrategia{
    private String preciorequerido;

    public HartoS(String preciorequerido) {
        this.preciorequerido = preciorequerido;
    }

    @Override
    public void execute(List<Celulares> tienda) {
        System.out.println("harto");
        for (Celulares celulares:tienda){
            if (tienda.size()>5){
                if (celulares.getMarca().equals(preciorequerido)) {
                    celulares.info();
                }
            }
        }
    }
}
