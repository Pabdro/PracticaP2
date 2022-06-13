package ejr2;

public interface IEjercito {
    void setNext(IEjercito handler);
    void criteriaHandler(String amount);
    IEjercito next();
}
