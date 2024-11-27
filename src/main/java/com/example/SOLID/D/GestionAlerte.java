package src.main.java.com.example.SOLID.D;

/**
 * Ajouter une classe EnvoiSMS afin d'envoyer une alerte par SMS et modifier la classe GestionAlerte en conséquence
 */
public class GestionAlerte {
    private EnvoiEmail envoiEmail = new EnvoiEmail();

    public void envoiAlert(String message) {
        envoiEmail.envoiMail(message);
    }
}
