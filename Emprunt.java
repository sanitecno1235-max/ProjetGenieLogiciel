import java.time.LocalDate;

public class Emprunt {
    // Attributs propres à l'emprunt
    private String idEmprunt;
    private LocalDate dateEmprunt;
    private LocalDate dateRetourPrevue;
    private boolean estRestitue;

    // Cardinalité 1 : Un emprunt est fait par UN cultivateur (Relation « emprunter »)
    private Cultivateur cultivateur;

    // Cardinalité 1 : Un emprunt concerne UN outil (Relation « concerner »)
    private Outil outil;

    // Constructeur complet
    public Emprunt(String idEmprunt, Cultivateur cultivateur, Outil outil, int dureeJours) {
        this.idEmprunt = idEmprunt;
        this.cultivateur = cultivateur;
        this.outil = outil;
        this.dateEmprunt = LocalDate.now(); // Date du jour
        this.dateRetourPrevue = this.dateEmprunt.plusDays(dureeJours);
        this.estRestitue = false;
        
        // Mettre à jour l'état de l'outil lors de l'emprunt
        if (outil != null) {
            outil.setEtat("Emprunté");
        }
    }

    // Méthode pour enregistrer le retour de l'outil
    public void enregistrerRetour() {
        this.estRestitue = true;
        if (this.outil != null) {
            this.outil.setEtat("Disponible");
        }
    }
    public void returner(){
        //ramerner l'outil emprunter
   } 
   public void prolonger(){
    //outil emprunter non rendu au magasin à la date retour prévue

    }

    // --- GETTERS ET SETTERS ---

    public String getIdEmprunt() { return idEmprunt; }

    public LocalDate getDateEmprunt() { return dateEmprunt; }

    public Cultivateur getCultivateur() { return cultivateur; }
    public void setCultivateur(Cultivateur cultivateur) { this.cultivateur = cultivateur; }

    public Outil getOutil() { return outil; }
    public void setOutil(Outil outil) { this.outil = outil; }

    public boolean isEstRestitue() { return estRestitue; }
}