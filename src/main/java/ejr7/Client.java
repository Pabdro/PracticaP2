package ejr7;

public class Client {
    public static void main(String[] args) {
        ManagerHandler man=new ManagerHandler();
        Thread hilo1 = new Thread(new Runnable() {
            @Override
            public void run() {
                Banco bancaMovil = new Banco(man);
                bancaMovil.pagarDinero(100);
                bancaMovil.pagarDinero(100);
                bancaMovil.pagarDinero(100);
                bancaMovil.pagarDinero(100);
                bancaMovil.pagarDinero(500);
                bancaMovil.pagarDinero(100);

            }
        });
        hilo1.start();
    }
}
