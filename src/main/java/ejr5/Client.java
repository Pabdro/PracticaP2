package ejr5;

public class Client {
    public static void main(String[] args) {
        CanalGithub canalGithub=new CanalGithub();
        canalGithub.attach(new UserGithub("commit", new Persona("11111","Miguel")));
        canalGithub.attach(new UserGithub("commit", new Persona("2222","Rodrigo")));
        canalGithub.attach(new UserGithub("commit", new Persona("33333","Gabriel")));

        Github github= new Github();
        Git git= new Git();

        Codigo codigo;
        codigo= new Codigo("public class..","iniciado",false);
        git.setCommit(codigo);
        github.createCommit("8096ez",git.createCommit());
        codigo= new Codigo("puclic abstract clas...","add persona",false);
        codigo= new Codigo("Class Person","add persona",false);
        codigo= new Codigo("Class Est","add estudiante",true);
        codigo= new Codigo("Class Doc","add doc",false);
        git.setCommit(codigo);
        github.createCommit("555ewq",git.createCommit());
        System.out.println();
        codigo = git.restoreCommit(github.getCommit("8096ez"));
        canalGithub.notifyObservers();
        System.out.println("*** cambios ***");
        codigo.showInfo();
        System.out.println("-----------");

        canalGithub.detach(0);
        canalGithub.detach(1);

        canalGithub.attach(new UserGithub("commit", new Persona("4444","Juan")));
        canalGithub.attach(new UserGithub("commit", new Persona("55556","German")));
        canalGithub.attach(new UserGithub("commit", new Persona("66666","Jose")));
        canalGithub.detach(0);

        codigo = git.restoreCommit(github.getCommit("555ewq"));
        canalGithub.notifyObservers();
        System.out.println("*** cambios ***");
        codigo.showInfo();
    }
}
