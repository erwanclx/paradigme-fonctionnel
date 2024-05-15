import java.util.Date;

public class Membre extends Personne {
    protected Date dateAdhesion;
    protected String statut;
    protected Livre[] emprunts;

    public Membre(String nom, String prenom, int id, Date dateAdhesion, String statut) {
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

    public void addEmprunts(Livre livre) {

    }
}