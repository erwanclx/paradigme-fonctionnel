import java.util.Date;
import java.util.ArrayList;

public class Membre extends Personne implements Notifiable {
    protected Date dateAdhesion;
    protected String statut;
    ArrayList<Livre> emprunts;

    public Membre(String nom, String prenom, int id, Date dateAdhesion, String statut) {
        super(nom, prenom, id);
        this.dateAdhesion = dateAdhesion;
        this.statut = statut;
        this.emprunts = new ArrayList<>();
    }

    public void afficherDetails() {
        System.out.println("Nom: " + this.nom);
        System.out.println("Prenom: " + this.prenom);
        System.out.println("ID: " + this.id);
        System.out.println("Date d'adhesion: " + this.dateAdhesion);
        System.out.println("Statut: " + this.statut);
        System.out.println("Emprunts: ");
        for (int i = 0; i < this.emprunts.size(); i++) {
            System.out.println(this.emprunts.get(i).getTitre());
        }
    }

    public void emprunter(Livre livre) {
        livre.emprunter();
        this.emprunts.add(livre);
    }

    public void retourner(Livre livre) {
        for (int i = 0; i < this.emprunts.size(); i++) {
            if (this.emprunts.get(i) == livre) {
                livre.retourner();
                this.emprunts.remove(i);
            }
        }
    }

    public void notifierRetour(Livre livre) {
        System.out.println("Le membre a été notifié du rendu de : " + livre.getTitre());
    }
}