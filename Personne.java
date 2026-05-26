classe personne
public abstract class Personne {

    private String id;
    private String nom;
    private String prenom;
    private String contact;

    public Personne(String id, String nom,
                    String prenom, String contact) {
        this.id      = id;
        this.nom     = nom;
        this.prenom  = prenom;
        this.contact = contact;
    }

    public String getId()      { return id; }
    public String getNom()     { return nom; }
    public String getPrenom()  { return prenom; }
    public String getContact() { return contact; }

    @Override
    public String toString() {
        return "[" + id + "] " + prenom + " " + nom;
    }
}





