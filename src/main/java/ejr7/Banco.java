package ejr7;

public class Banco {
    private ManagerHandler managerHandler;

    public Banco(ManagerHandler managerHandler) {
        this.managerHandler = managerHandler;
    }

    public void pagarDinero(int cantidad){
        ManagerSaldo.getInstance().pagoDinero(cantidad);
        managerHandler.criteriaHandler(cantidad);
    }


}
