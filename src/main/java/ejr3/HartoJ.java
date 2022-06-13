package ejr3;


import java.util.List;

public class HartoJ implements IEstrategia{
    private int preciorequerido;
    private String marca;

    public HartoJ(int preciorequerido, String marca) {
        this.preciorequerido = preciorequerido;
        this.marca = marca;
    }

    @Override
    public void execute(List<Celulares> tienda) {
        System.out.println("harto");
        for (Celulares celulares:tienda){
            if (tienda.size()>5){
                if (celulares.getPrecio()==preciorequerido&&celulares.getMarca().equals(marca)) {
                    celulares.info();
                }
            }
        }
    }
}
