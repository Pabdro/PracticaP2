package ejr1;

import java.util.HashMap;
import java.util.Map;

public class Caretaker {
    private Map<String,Memento> tesisP=new HashMap<>();
    public void createTesis(String tesisE,Memento m){
        tesisP.put(tesisE,m);
    }

    public Memento getTesis(String tesisE){

        return tesisP.get(tesisE);
    }
}
