import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // 1. CRÉATION DU MAGASIN
    
        Magasin magasin = new Magasin(1, "Magasin Wakwa", "Wakwa, Ngaoundéré");

    
        // AJOUT DES OUTILS AU MAGASIN

        Outil houe = new Outil(1, "Houe", "Bon");
        Outil machette = new Outil(2, "Machette", "Bon");
        Outil arrosoir = new Outil(3, "Arrosoir", "Bon");

        magasin.ajouterOutil(houe);
        magasin.ajouterOutil(machette);
        magasin.ajouterOutil(arrosoir);

        System.out.println(" OUTILS AJOUTÉS AU MAGASIN ");
        magasin.afficherOutils();

        //  CRÉATION DES CULTIVATEURS
        Cultivateur c1 = new Cultivateur(1, "Mbarga", "Paul", "677001122");
        Cultivateur c2 = new Cultivateur(2, "Njoya", "Aissatou", "699334455");
        Cultivateur c3 = new Cultivateur(3, "Talla", "Jean", "655112233");

        //  CRÉATION DE L'ADMINISTRATEUR

        Administrateur admin = new Administrateur(10, "Hamidou", "Ali", "655000001", "principal");

    

        // EMPRUNT D'UN OUTIL

        System.out.println("\nEMPRUNT ");
        Emprunt e1 = c1.emprunter(houe, magasin);
        if (e1 != null) {
            System.out.println(c1.getNom() + " a emprunté : " + houe.getNom());
        }

        //  RÉSERVATION D'UN OUTIL

        System.out.println("\n RÉSERVATION ");
        Reservation r1 = c2.reserver(machette, magasin);
        if (r1 != null) {
            r1.confirmer(LocalDate.now().plusDays(3));
            System.out.println(c2.getNom() + " a réservé : " + machette.getNom());
        }


        System.out.println("\n DÉCLARATION PERTE ");
        arrosoir.declarerPerdu();
        System.out.println(arrosoir.getNom() + " déclaré perdu !");


        System.out.println("\n RÉPARATION ");
        houe.reparer();
        System.out.println(houe.getNom() + " réparé !");

        // RETOUR D'UN OUTIL EMPRUNT
        System.out.println("\n RETOUR OUTIL ");
        e1.retourner();
        System.out.println(houe.getNom() + " retourné au magasin !");

        //  SUPPRESSION PAR ADMIN UNIQUEMENT
        System.out.println("\n SUPPRESSION ADMIN ");
        admin.supprimerOutil(machette, magasin);

        //  UN CULTIVATEUR QUITTE LA COOPÉRATIVE
        System.out.println("\nDÉPART CULTIVATEUR.");
        c3.quitterCooperative();
        System.out.println(c3.getNom() + " a quitté la coopérative !");


}
