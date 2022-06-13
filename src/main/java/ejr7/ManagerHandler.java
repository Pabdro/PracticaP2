package ejr7;


public class ManagerHandler implements IHandler {

    private IHandler next;

    @Override
    public void setNext(IHandler handler) {
        next=handler;
    }

    @Override
    public void criteriaHandler(int amount) {
        Cajero resp1= new Cajero();
        this.setNext(resp1);

        AgenteDeCredito resp2 = new AgenteDeCredito();
        resp1.setNext(resp2);

        Supervisor resp3 = new Supervisor();
        resp2.setNext(resp3);

        EncargadoDePrestamo respFinal = new EncargadoDePrestamo();
        resp3.setNext(respFinal);

        this.next.criteriaHandler(amount);
    }

    @Override
    public IHandler next() {
        return next;
    }
}