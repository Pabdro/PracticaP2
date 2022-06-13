package ejr1;

public class Tesis {
    private  String informacion;

    public Tesis(String informacion) {
        this.informacion = informacion;
    }

    public String getInformacion() {
        return informacion;
    }

    public void setInformacion(String informacion) {
        this.informacion = informacion;
    }
    public void showInfo(){
        System.out.println(informacion);
    }
}
