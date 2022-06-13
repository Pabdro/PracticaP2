package ejr2;

public class General implements IEjercito{
    private IEjercito next;
    @Override
    public void setNext(IEjercito handler) {
        next=handler;
    }

    @Override
    public void criteriaHandler(String amount) {
        if (amount.equals("Entrevistas,Disciplina,Desbloqueos,Manifestaciones,Limpiezas")){
            System.out.println("General esta solucionando su problema... :"+amount);
        } else {
            next.criteriaHandler(amount);
        }
    }

    @Override
    public IEjercito next() {
        return next;
    }
}
