public class Administrateur extends Personne {

    private String niveau;

    // Constructeur
    public Administrateur(int id, String nom, String prenom, String contact, String niveau) {
        super(id, nom, prenom, contact);
        this.niveau = niveau;
    }

    // Getter
    public String getNiveau() {
        return niveau;
    }

    // Setter
    public void setNiveau(String niveau) {
        this.niveau = niveau;
    }

    // Ajouter un outil
    public void ajouterOutil() {
        System.out.println("Outil ajouté avec succès.");
    }

    // Supprimer un outil
    public void supprimerOutil() {
        System.out.println("Outil supprimé avec succès.");
    }

    // Retirer un outil
    public void retirerOutil() {
        System.out.println("Outil retiré du système.");
    }

    // Gérer le registre
    public void gererRegistre() {
        System.out.println("Registre mis à jour.");
    }
}
