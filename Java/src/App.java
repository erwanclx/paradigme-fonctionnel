import java.util.Date;

public class App {
    public static void main(String[] args) throws Exception {
        Personne[] personnes = new Personne[2];
        personnes[0] = new Membre("Cloux", "Erwan", 1, new Date(), "");
        personnes[1] = new Employe("Fleury", "Sébastien", 2, "Directeur", 5000.17);

        for (int i = 0; i < personnes.length; i++) {
            personnes[i].afficherDetails();
            System.out.println("===============");
        }

    }
}
