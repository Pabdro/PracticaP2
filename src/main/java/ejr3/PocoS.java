package ejr3;


import java.util.List;

public class PocoS implements IEstrategia{
    private String preciorequerido;

    public PocoS(String preciorequerido) {
        this.preciorequerido = preciorequerido;
    }

    @Override
    public void execute(List<Celulares> tienda) {
        System.out.println("poco");
        for (Celulares celulares:tienda){
            if (tienda.size()<5){
                if (celulares.getMarca().equals(preciorequerido)) {
                    celulares.info();
                }
            }
        }
    }
}
