package ejr7;

public class Cajero implements IHandler{
    private IHandler next;
    @Override
    public void setNext(IHandler handler) {
        next=handler;
    }

    @Override
    public void criteriaHandler(int amount) {
        int saldo = ManagerSaldo.getInstance().getSaldoPrestamo() - ManagerSaldo.getInstance().getSaldo();
        if (saldo<ManagerSaldo.getInstance().getSaldoPrestamo()*25/100){
            System.out.println("Cajero le ayudará en su pago :"+amount);
        } else {
            next.criteriaHandler(amount);
        }
    }

    @Override
    public IHandler next() {
        return next;
    }
}
