package src.main.java.com.example.SOLID.S;

/**
 * La classe Client gère à la fois la gestion des données du client et l'envoi d'un mail de bienvenu au client. Refactorisez-la pour respecter la lettre S de SOLID
 */
public class Client {
    private String nom;
    private String prenom;
    private String adresse;
    private String email;

    // CONSTRUCTEURS
    public Client(String name, String email) {
        this.nom = name;
        this.email = email;
    }

    // GETTERS AND SETTERS

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // TO STRING
    @Override
    public String toString() {
        return "Client{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", adresse='" + adresse + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    // ENVOI UN MAIL DE BIENVENU AU CLIENT
    public void envoiMailBienvenu() {
        System.out.println("Envoyé à : "+email);
        System.out.println("Message : Bienvenue "+prenom+" !");
    }
}
