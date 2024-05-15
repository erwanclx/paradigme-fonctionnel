public class Membre extends Personne {
    protected String dateAdhesion;
    protected String statut;

    public Membre(String nom, String prenom, int id, String dateAdhesion, String statut) {
        super(nom, prenom, id);
        this.dateAdhesion = dateAdhesion;
        this.statut = statut;
    }

    public void afficherDetails() {
        System.out.println("Nom: " + nom);
        System.out.println("Prenom: " + prenom);
        System.out.println("ID: " + id);
        System.out.println("Date d'adhesion: " + dateAdhesion);
        System.out.println("Statut: " + statut);
    }
}