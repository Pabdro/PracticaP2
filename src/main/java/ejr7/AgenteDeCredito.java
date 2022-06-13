package ejr7;

public class AgenteDeCredito implements IHandler{
    private IHandler next;
    private ManagerSaldo managerSaldo;
    @Override
    public void setNext(IHandler handler) {
        next=handler;
    }

    @Override
    public void criteriaHandler(int amount) {
        int saldo = ManagerSaldo.getInstance().getSaldoPrestamo() - ManagerSaldo.getInstance().getSaldo();
        if (saldo>=ManagerSaldo.getInstance().getSaldoPrestamo()*25/100&& saldo<ManagerSaldo.getInstance().getSaldoPrestamo()*50/100){
            System.out.println("Agente De Credito esta ayudando, no quiere un refinamiento? :"+amount);
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