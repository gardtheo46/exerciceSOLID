package src.main.java.com.example.SOLID.I;

public class Bateau implements Vehicule{
    @Override
    public void demarrer() {
        System.out.println("Le bateau a démarré");
    }

    @Override
    public void voler() {
        System.out.println("Un bateau ne vole pas");
    }

    @Override
    public void naviguer() {
        System.out.println("Le bateau navigue");
    }
}