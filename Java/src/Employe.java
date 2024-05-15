public class Employe extends Personne {
    protected String poste;
    protected Double salaire;

    public Employe(String nom, String prenom, int id, String poste, Double salaire) {
        super(nom, prenom, id);
        this.poste = poste;
        this.salaire = salaire;
    }

    public String getPoste() {
        return this.poste;
    }

    public Double getSalaire() {
        return this.salaire;
    }

    public void afficherDetails() {
        System.out.println("Nom: " + this.nom);
        System.out.println("Prenom: " + this.prenom);
        System.out.println("ID: " + this.id);
        System.out.println("Poste: " + this.poste);
        System.out.println("Salaire: " + this.salaire);
    }
}