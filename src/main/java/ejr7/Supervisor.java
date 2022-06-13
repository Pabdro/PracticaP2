package ejr7;

public class Supervisor implements IHandler{
    private IHandler next;
    @Override
    public void setNext(IHandler handler) {
        next=handler;
    }

    @Override
    public void criteriaHandler(int amount) {
        int saldo = ManagerSaldo.getInstance().getSaldoPrestamo() - ManagerSaldo.getInstance().getSaldo();
        if (saldo>=ManagerSaldo.getInstance().getSaldoPrestamo()*50/100&& saldo<ManagerSaldo.getInstance().getSaldoPrestamo()){
            System.out.println("Supervisor... :"+amount);
            //plata.pagarDinero(amount);
        } else {
            next.criteriaHandler(amount);
        }
    }

    @Override
    public IHandler next() {
        return next;
    }
}
