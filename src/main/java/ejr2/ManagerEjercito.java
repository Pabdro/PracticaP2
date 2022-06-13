package ejr2;


public class ManagerEjercito implements IEjercito {

    private IEjercito next;

    @Override
    public void setNext(IEjercito handler) {
        next=handler;
    }

    @Override
    public void criteriaHandler(String amount) {
        Cabo resp1= new Cabo();
        this.setNext(resp1);

        Coronel resp2 = new Coronel();
        resp1.setNext(resp2);

        Teniente resp3 = new Teniente();
        resp2.setNext(resp3);

        General respFinal = new General();
        resp3.setNext(respFinal);

        this.next.criteriaHandler(amount);
    }

    @Override
    public IEjercito next() {
        return next;
    }
}