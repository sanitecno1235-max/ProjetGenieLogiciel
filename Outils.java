
public class Outil {
    private int id;
    private String nom;
    private String description;
    private EtatOutil etat;
    private boolean disponible;
    private Magasin magasin;

    public Outil(int id, String nom, String description) {
        this.id = id;
        this.nom = nom;
        this.description = description;
        this.etat = EtatOutil.DISPONIBLE;
        this.disponible = true;
    }

    public int getId() { return id; }
    public String getNom() { return nom; }
    public String getDescription() { return description; }
    public EtatOutil getEtat() { return etat; }
    public boolean isDisponible() { return disponible; }
    public Magasin getMagasin() { return magasin; }

    public void setEtat(EtatOutil etat) { this.etat = etat; }
    public void setDisponible(boolean disponible) { this.disponible = disponible; }
    public void setMagasin(Magasin magasin) { this.magasin = magasin; }

    public void reparer() {
        this.etat = EtatOutil.DISPONIBLE;
        this.disponible = true;
        System.out.println("Outil réparé : " + nom);
    }

    public void declarerPerdu() {
        this.etat = EtatOutil.PERDU;
        this.disponible = false;
        System.out.println("Outil déclaré perdu : " + nom);
    }

    @Override
    public String toString() {
        return "[" + id + "] " + nom + " - État: " + etat
            + " - Disponible: " + disponible;
    }
}