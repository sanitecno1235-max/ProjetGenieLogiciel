classe reservation
public class Reservation {
    private int id;
    private Date dateReservation;
    private Date DateDebut;
    private Date DateFin;
    private String statut;

    public  Reservation(int id, Date dateREservation, Date DateDebut, Date DateFin, String statut) {
        this.int id;
        this.dateREservation = dateREservation;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.statut = statut;
    }
    public int getId() {
        return id;
    }
    public void setId(ind id) {
        this.id = id;
    }
    public Date getDateReservation() {
        retur dateReservation;
    }
    public void setDateReservation(Date dateReservation) {
        this.dateReservation = dateReservation;
    }
    public Date getDateDEbut() {
        retur dateDebut;
    }
    public Date setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }
    public Date getDatFin() {
        retur dateFin;
    }
    public Date setDateFin(Date dateFin) {
        this.dateDebut = dateFin;
    }
    public String getStatut() {
        return statut;
    }
    public void setStatut(String statut) {
        this.statut = statut;
    }
}