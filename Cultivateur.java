import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Cultivateur extends Personne {
    private boolean actif;
    private List<Emprunt> emprunts;
    private List<Reservation> reservations;

    public Cultivateur(int id, String nom, String prenom, String contact) {
        super(id, nom, prenom, contact);
        this.actif = true;
        this.emprunts = new ArrayList<>();
        this.reservations = new ArrayList<>();
    }

    public boolean isActif() { return actif; }
    public void setActif(boolean actif) { this.actif = actif; }

    public Emprunt emprunter(Outil outil, Date dateRetourPrevue) {
        if (!actif) {
            System.out.println("Cultivateur inactif, emprunt impossible.");
            return null;
        }
        if (!outil.isDisponible()) {
            System.out.println("Outil non disponible.");
            return null;
        }
        Emprunt emprunt = new Emprunt(
            emprunts.size() + 1, this, outil,
            new Date(), dateRetourPrevue
        );
        outil.setDisponible(false);
        emprunts.add(emprunt);
        System.out.println(this + " a emprunté : " + outil.getNom());
        return emprunt;
    }

    public Reservation reserver(Outil outil, Date dateDebut, Date dateFin) {
        if (!actif) {
            System.out.println("Cultivateur inactif, réservation impossible.");
            return null;
        }
        Reservation reservation = new Reservation(
            reservations.size() + 1, this, outil,
            new Date(), dateDebut, dateFin
        );
        reservations.add(reservation);
        System.out.println(this + " a réservé : " + outil.getNom());
        return reservation;
    }

    public void faireInventaire(Magasin magasin) {
        System.out.println("=== Inventaire par " + this + " ===");
        magasin.listerOutils();
    }

    public List<Emprunt> getEmprunts() { return emprunts; }
    public List<Reservation> getReservations() { return reservations; }

    public void quitterCooperative() {
        this.actif = false;
        System.out.println(this + " a quitté la coopérative.");
    }
}
