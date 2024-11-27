package src.main.java.com.example.SOLID.L;


public class Rectangle {
        private double largeur, hauteur;

        public void setLargeur(double largeur) {
            this.largeur = largeur;
        }

        public void setHauteur(double hauteur) {
            this.hauteur = hauteur;
        }

        public double calculAire() {
            return largeur * hauteur;
        }
    }
