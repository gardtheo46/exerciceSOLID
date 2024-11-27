package src.main.java.com.example.SOLID.I;

public class Voiture implements Vehicule{
    @Override
    public void demarrer() {
        System.out.println("La voiture a démarré");
    }

    @Override
    public void voler() {
        System.out.println("Une voiture ne vole pas");
    }

    @Override
    public void naviguer() {
        System.out.println("Une voiture ne navigue pas");
    }
}
