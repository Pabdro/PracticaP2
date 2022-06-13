package ejr5;

public class UserGithub implements IUser{
    String catalizador;
    Persona persona;

    public UserGithub(String notificacion, Persona persona) {
        this.catalizador = notificacion;
        this.persona = persona;
    }

    @Override
    public void update(String msg) {
        System.out.println("******* Notificacion: "+msg+" *****");
        System.out.println("persona: "+persona.getName());
        System.out.println("preferencia: "+ catalizador);
    }

    @Override
    public String getPreferenciaNotificaciones() {
        return catalizador;
    }

    public Persona getPersona() {
        return persona;
    }
}
