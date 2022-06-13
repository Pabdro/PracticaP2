package ejr3;

public class Client {
    public static void main(String[] args) {
        TiendoCelulares tiendoCelulares=new TiendoCelulares();
        tiendoCelulares.addCelular(new Celulares("nokia","nokia","100",40));
        tiendoCelulares.addCelular(new Celulares("s10","samsung","100",45));


        tiendoCelulares.setEstrategia(new Harto(100));
        tiendoCelulares.iniciarEstrategia();
        System.out.println();
        tiendoCelulares.setEstrategia(new Poco(40));
        tiendoCelulares.iniciarEstrategia();
        tiendoCelulares.setEstrategia(new PocoS("nokia"));
        tiendoCelulares.iniciarEstrategia();
        tiendoCelulares.setEstrategia(new PocoJ(45, "samsung"));
        tiendoCelulares.iniciarEstrategia();
    }
}
