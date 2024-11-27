package src.main.java.com.example.SOLID.I;

public class Avion implements Vehicule{
    @Override
    public void demarrer() {
        System.out.println("L'avion a démarré");
    }

    @Override
    public void voler() {
        System.out.println("L'avion vole");
    }

    @Override
    public void naviguer() {
        System.out.println("Un avion ne navigue pas");
    }
}
