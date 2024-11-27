package src.main.java.com.example.SOLID.L;

/**
 * Ici, Un carré est modélisé comme une sous-classe de rectangle, mais cela viole le principe LSP car un carré ne respecte pas le comportement attendu d’un rectangle.
 */
public class Carre extends Rectangle {
    @Override
    public void setLargeur(double largeur) {
        super.setLargeur(largeur);
        super.setHauteur(largeur);
    }

    @Override
    public void setHauteur(double hauteur) {
        super.setLargeur(hauteur);
        super.setHauteur(hauteur);
    }
}
