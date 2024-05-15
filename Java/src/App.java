import java.util.Date;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Personne> personnes = new ArrayList<Personne>();

        Membre membre1 = new Membre("Cloux", "Erwan", 1, new Date(), "");
        Employe employe2 = new Employe("Fleury", "Sébastien", 2, "Directeur", 5000.17);

        Livre firstLivre = new Livre("Le petit chaperon rouge", "Erwan", "3472");

        personnes.add(membre1);
        personnes.add(employe2);

        for (int i = 0; i < personnes.size(); i++) {
            personnes.get(i).afficherDetails();
            System.out.println("===============");
        }

        membre1.emprunter(firstLivre);
        System.out.println("");
        firstLivre.afficherDetails();
        System.out.println("===============");

        for (int i = 0; i < personnes.size(); i++) {
            personnes.get(i).afficherDetails();
            System.out.println("===============");
        }

        System.out.println("=== Retour du livre ===");

        membre1.retourner(firstLivre);
        System.out.println("");
        firstLivre.afficherDetails();
        System.out.println("===============");

        for (int i = 0; i < personnes.size(); i++) {
            personnes.get(i).afficherDetails();
            System.out.println("===============");
        }

    }
}
