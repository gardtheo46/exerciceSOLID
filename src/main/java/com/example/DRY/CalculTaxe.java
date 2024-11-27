package src.main.java.com.example.DRY;

/**
 * Identifier le pattern qui se repète et simplifier les trois méthodes
 */
public class CalculTaxe {
    public double calculerTaxeAlimentaire(double prix) {
        double taxe = prix * 0.05; // Taxe de 5%
        double total = prix + taxe;
        return total;
    }

    public double calculerTaxeElectronique(double prix) {
        double taxe = prix * 0.18; // Taxe de 18%
        double total = prix + taxe;
        return total;
    }

    public double calculerTaxeVetement(double prix) {
        double taxe = prix * 0.12; // Taxe de 12%
        double total = prix + taxe;
        return total;
    }
}
