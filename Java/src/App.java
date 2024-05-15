import java.util.Date;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Personne> personnes = new ArrayList<Personne>();

        Membre membre1 = new Membre("Cloux", "Erwan", 1, new Date(), "");
        Employe employe1 = new Employe("Fleury", "Sébastien", 2, "Directeur", 5000.17);
        Bibliothecaire bibliothecaire1 = new Bibliothecaire("Lefevre", "Marie", 3, "Bibliothecaire en cheffe", 2000.0);
        Bibliothecaire bibliothecaire2 = new Bibliothecaire("Dubois", "Roman", 3, "Bibliothecaire assistante", 1700.0);

        Livre firstLivre = new Livre("Le petit chaperon rouge", "Hugoat", "3472");
        Livre secondLivre = new Livre("Le petit chaperon pas rouge", "Arthur", "3473");

        personnes.add(membre1);
        personnes.add(employe1);
        personnes.add(bibliothecaire1);
        personnes.add(bibliothecaire2);

        for (int i = 0; i < personnes.size(); i++) {
            personnes.get(i).afficherDetails();
            System.out.println("===============");
        }

        membre1.emprunter(firstLivre);
        membre1.emprunter(secondLivre);
        System.out.println("");
        firstLivre.afficherDetails();
        System.out.println("===============");

        for (int i = 0; i < personnes.size(); i++) {
            personnes.get(i).afficherDetails();
            System.out.println("===============");
        }

        System.out.println("=== Retour du livre ===");

        membre1.retourner(firstLivre);
        bibliothecaire1.notifierRetour(firstLivre);

        System.out.println("");
        firstLivre.afficherDetails();
        System.out.println("===============");

        for (int i = 0; i < personnes.size(); i++) {
            personnes.get(i).afficherDetails();
            System.out.println("===============");
        }

    }
}
