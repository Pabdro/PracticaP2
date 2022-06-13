package ejr3;

import java.util.ArrayList;
import java.util.List;

public class TiendoCelulares {
    private IEstrategia estrategia;
    private List<Celulares> celularesList=new ArrayList<>();
    public TiendoCelulares(){
    }

    public IEstrategia getEstrategia() {
        return estrategia;
    }

    public void setEstrategia(IEstrategia estrategia) {
        this.estrategia = estrategia;
    }
    public void addCelular(Celulares celulares){
        celularesList.add(celulares);
    }
    public void iniciarEstrategia(){
        estrategia.execute(celularesList);
    }
}
