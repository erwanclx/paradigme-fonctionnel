public class Livre implements Empruntable {
    protected String titre;
    protected String auteur;
    protected String isbn;
    protected Boolean disponible;

    public Livre(String titre, String auteur, String isbn, Boolean disponible) {
        this.titre = titre;
        this.auteur = auteur;
        this.isbn = isbn;
        this.disponible = disponible;
    }

    public String getTitre() {
        return this.titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getAuteur() {
        return this.auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public String getIsbn() {
        return this.isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Boolean getDisponible() {
        return this.disponible;
    }

    public void setDisponible(Boolean disponible) {
        this.disponible = disponible;
    }

    public void afficherDetails() {
        System.out.println("Titre: " + titre);
        System.out.println("Auteur: " + auteur);
        System.out.println("ISBN: " + isbn);
        System.out.println("Disponible: " + disponible);
    }

    public void emprunter() {
        if (disponible) {
            disponible = false;
            System.out.println("Le livre " + titre + " a été emprunté.");
        } else {
            System.out.println("Le livre " + titre + " n'est pas disponible.");
        }
    }

    public void retourner() {
        if (!disponible) {
            disponible = true;
            System.out.println("Le livre " + titre + " a été retourné.");
        } else {
            System.out.println("Le livre " + titre + " n'a pas été emprunté.");
        }
    }

}