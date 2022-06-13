package ejr5;

import java.util.ArrayList;
import java.util.List;

public class CanalGithub implements ICanal{
    private List<IUser> users= new ArrayList<>();

    public CanalGithub(){}

    @Override
    public void attach(IUser observer) {
        users.add(observer);
    }

    @Override
    public void detach(int posicion) {
        users.remove(posicion);
    }

    @Override
    public void notifyObservers() {
        for (IUser user:users ) {
                user.update("nuevos cambios en el codigo");

        }
    }
}
