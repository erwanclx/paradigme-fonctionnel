public class Membre extends Personne {
    protected String dateAdhesion;
    protected String statut;

    public Membre(String nom, String prenom, int id, String dateAdhesion, String statut) {
        super(nom, prenom, id);
        this.dateAdhesion = dateAdhesion;
        this.statut = statut;
    }

    public void afficherDetails() {
        System.out.println("Nom: " + this.nom);
        System.out.println("Prenom: " + this.prenom);
        System.out.println("ID: " + this.id);
        System.out.println("Date d'adhesion: " + this.dateAdhesion);
        System.out.println("Statut: " + this.statut);
    }
}