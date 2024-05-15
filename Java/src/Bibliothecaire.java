public class Bibliothecaire extends Employe implements Notifiable {

    public Bibliothecaire(String nom, String prenom, int id, String poste, Double salaire) {
        super(nom, prenom, id, poste, salaire);
    }

    public void notifierRetour(Livre livre) {
        System.out.println("Le bibliothecaire a été notifié du rendu de : " + livre.getTitre());
    }
}
