package ejr2;

public class Client {
    public static void main(String[] args) {
        ManagerEjercito managerEjercito=new ManagerEjercito();
        managerEjercito.criteriaHandler("Entrevistas,Disciplina,Desbloqueos,Manifestaciones,Limpiezas");
        managerEjercito.criteriaHandler("Disciplina,Desbloqueos,Manifestaciones,Limpiezas");
        managerEjercito.criteriaHandler("Manifestaciones,Limpiezas");
        managerEjercito.criteriaHandler("Limpiezas");
    }
}
