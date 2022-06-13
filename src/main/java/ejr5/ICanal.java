package ejr5;

public interface ICanal {
    void attach(IUser observer);
    void detach(int posicion);
    void notifyObservers();
}