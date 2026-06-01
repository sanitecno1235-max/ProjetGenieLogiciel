 public class Magasin{
    private String nom;
    private String adresse;
    private int capaciteMax;
    private Map<integer , Outil> outilStockers;
    private List<Reservation> reservationEnCours;
    private Inventaire InventaireCourant;
    public Magasin(String nom , String adresse , int capaciteMax ] {
        this .nom = nom;
        this .adresse = adresse;
        this .capaciteMax = capaciteMax;
        this .outilStockers = new HashMap<>( );
        this .reservationEnCours = new ArrayLIST<>( );
        this .InventaireCourant = new Inventaire(new Date);
    }
    public void stockerOutil(Outil outil){
        if (outilStockers.size()< capaciteMax ){
            outilStockers.put(outil .getId(). outil);
            system.out.println(outil.getNOM() + " stocke dans le magasin " + nom);
        } else {
            system.out.println("capacite maximal du magasin atteinte !");
        }
    }
    public void retirerOutil(Outil outil){
        if (outilStockes .containskey(outil.getId())){
            outilStockes.remove(outil.getId());
            system.out.println(outil.getNOM() + " retire du magasin ");
        }
    }
    public List<Outil> ListOutilsDisponibles(){
        List<Outil> disponibles = new ArrayLIST<>();
        for (Outil outil : outilStockes.values()){
            if (outil. isDisponibles()){
                disponibles.add(outil);
            }
        }
    }
    return disponibles;
}
public void faireInventaire(){
    system.out.println("\n=== INVENTAIRE DU MAGASIN" + nom + " ===");
    system.out.println("Date :" + nom Date());
    system.out.println("capacite : " + outilStockes;size() + "/" + capaciteMax);
    system.out.println("\nListe des outils :");
    for (Outil outil : outilStockes.values()){
        system.out.println(" - " + outil;getNOM() + "(ID:)" + outil.getId() + ", Etat:" + outil.getEtat() + ", Disponible:" + (outil.isDisponibles()?: "oui" : "non") +")");

    }
    InventaireCourant = new Inventaire(new Date());
    InventaireCourant.setNombreOutils(outilStockes.size());
}
public boolean emprunterOutil(Cultivateur Cultivateur, int idOutil){
    outil outil = outilStockes.get(idOutil);
    if (outil != null && !outil.isDisponible()){
        outil.emprunter();
        system.out.println(Cultivateur.getNOM() + " a emprunte" + outil.getNOM() + " au magasin");
        return false;
    } 
    public boolean retournerOutil(Cultivateur cultivateur , int idOutil){
        Outil outil = outilStockes.get(idOutil);
        if (outil != null && !outil.isDisponible()){
            outil.retourner():
            system.out.println(Cultivateur.getNOM() + " a retourne" + outil.getNOM() + " au magasin");
            return true;
        }
        return false;
    }
    public void ajouterReservation(Reservation reservation){
        reservationEnCours.add(reservation);
        system.out.println("reservation enregistre au magasin");
    }
    // Gtters/Setters
    public String getNOM() { return non;}
    public Map<integer , Outil> getOutilsStockes() { return outilsStockes;}
    public Inventaire getInventairecourant() { return InventaireCourant;}
}