package ejr2;

public class Teniente implements IEjercito{
    private IEjercito next;
    @Override
    public void setNext(IEjercito handler) {
        next=handler;
    }

    @Override
    public void criteriaHandler(String amount) {
        if (amount.equals("Disciplina,Desbloqueos,Manifestaciones,Limpiezas")){
            System.out.println("Teniente esta solucionando su problema... :"+amount);
        } else {
            next.criteriaHandler(amount);
        }
    }

    @Override
    public IEjercito next() {
        return next;
    }
}
