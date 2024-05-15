public class Livre implements Empruntable {
    protected String titre;
    protected String auteur;
    protected String isbn;
    protected Boolean isDisponible;

    public Livre(String titre, String auteur, String isbn) {
        this.titre = titre;
        this.auteur = auteur;
        this.isbn = isbn;
        this.isDisponible = true;
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

    public Boolean getIsDisponible() {
        return this.isDisponible;
    }

    public void setIsDisponible(Boolean disponible) {
        this.isDisponible = disponible;
    }

    public void afficherDetails() {
        System.out.println("Titre: " + titre);
        System.out.println("Auteur: " + auteur);
        System.out.println("ISBN: " + isbn);
        System.out.println("Disponible: " + isDisponible);
    }

    public void emprunter() {
        if (this.isDisponible) {
            setIsDisponible(false);
            System.out.println("Le livre " + titre + " a été emprunté.");
        } else {
            System.out.println("Le livre " + titre + " n'est pas disponible.");
        }
    }

    public void retourner() {
        if (!this.isDisponible) {
            setIsDisponible(true);
            System.out.println("Le livre " + titre + " a été retourné.");
        } else {
            System.out.println("Le livre " + titre + " n'a pas été emprunté.");
        }
    }

}