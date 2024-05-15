// Écrivez un programme principal qui crée une liste de Personne contenant à la fois des objets Membre et Employe.
// Utilisez le polymorphisme pour appeler la méthode afficherDetails sur chaque objet de la liste.

public class App {
    public static void main(String[] args) throws Exception {
        Personne[] personnes = new Personne[2];
        personnes[0] = new Membre("Cloux", "Erwan", 1, "15/05/2024", "");
        personnes[1] = new Employe("Fleury", "Sébastien", 2, "Directeur", 5000.17);

        personnes[0].afficherDetails();
        System.out.println("===============");
        personnes[1].afficherDetails();
    }
}
