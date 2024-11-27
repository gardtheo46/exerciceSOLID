package src.main.java.com.example.SOLID.O;

/**
 * Voici un calculateur de salaire qui ne respecte pas la lettre O de SOLID car à chaque nouveau type d'employé, on doit modifier cette classe.
 */
public class CalculSalaire {
    public double calculetteSalaire(String typeEmployee, double base) {
        if ("CADRE".equals(typeEmployee)) {
            return base * 1.5;
        } else if ("ALTERNANT".equals(typeEmployee)) {
            return base * 0.5;
        } else if ("CLASSIQUE".equals(typeEmployee)) {
            return base * 1.0;
        }
        throw new IllegalArgumentException("Employé inconnu");
    }
}

