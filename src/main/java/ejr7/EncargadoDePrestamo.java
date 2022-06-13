package ejr7;

public class EncargadoDePrestamo implements IHandler{
    private IHandler next;
    @Override
    public void setNext(IHandler handler) {
        next=handler;
    }

    @Override
    public void criteriaHandler(int amount) {
        int saldo = ManagerSaldo.getInstance().getSaldoPrestamo() - ManagerSaldo.getInstance().getSaldo();
        if (saldo==ManagerSaldo.getInstance().getSaldoPrestamo()){
            System.out.println("EncargadoDePrestamo... :"+amount);
            //plata.pagarDinero(amount);
        } else {
            next.criteriaHandler(amount);
        }
    }

    @Override
    public IHandler next() {
        return next;
    }
    public void pagarDinero(int cantidad){
        ManagerSaldo.getInstance().pagoDinero(cantidad);
    }
}
