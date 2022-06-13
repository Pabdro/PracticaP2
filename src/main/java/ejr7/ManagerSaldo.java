package ejr7;

public class ManagerSaldo {
    private static ManagerSaldo managerSaldo;
    private int saldo;
    private int saldoPrestamo;
    private int saldoPagado;

    private ManagerSaldo(){
        saldoPrestamo=1000;
        saldo=saldoPrestamo;
        saldoPagado=0;
    }


    private synchronized static void  multiThreadControl(){
        if (managerSaldo== null)
            managerSaldo= new ManagerSaldo();
    }


    public static ManagerSaldo getInstance(){
        if (managerSaldo==null)
            multiThreadControl();
        return managerSaldo;
    }

    public int getSaldoPrestamo() {
        return saldoPrestamo;
    }

    public void setSaldoPrestamo(int saldoPrestamo) {
        this.saldoPrestamo = saldoPrestamo;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public synchronized void pagoDinero(int cantidad){
        if (cantidad<=saldo){
            saldo=saldo-cantidad;
            saldoPagado=saldoPagado+cantidad;
            System.out.println("cantidad a pagar: ["+cantidad+"] deuda despues del pago[" +saldo+"]");
        }else{
            System.out.println("ERROR! Cantidad a pagar: "+cantidad + "deuda actual "+saldo);
        }
    }
}