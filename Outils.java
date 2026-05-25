public class Main {
    public static void main(String[] args) {
        // Création du magasin
        Magasin magasin = new Magasin(1, "Magasin Wakwa", "Wakwa, Ngaoundéré");

        // Ajout d'outils
        Outil houe = new Outil(1, "Houe");
        Outil machette = new Outil(2, "Machette");
        Outil arrosoir = new Outil(3, "Arrosoir");
        magasin.ajouterOutil(houe);
        magasin.ajouterOutil(machette);
        magasin.ajouterOutil(arrosoir);

        // Création des acteurs
        Cultivateur c1 = new Cultivateur(1, "Mbarga", "Paul", "677001122");
        Cultivateur c2 = new Cultivateur(2, "Njoya", "Aïssatou", "699334455");
        Administrateur admin = new Administrateur(10, "Hamidou", "Ali",
                                                  "655000001", "principal");

        // Emprunt
        Emprunt e1 = c1.emprunter(houe);
        System.out.println(e1);

        // Réservation
        Reservation r1 = c2.reserver(machette);
        r1.confirmer(java.time.LocalDate.now().plusDays(3));

        // Inventaire
        c1.faireinventaire(magasin);

        // Déclaration perte
        arrosoir.declarerPerdu();

        // Retour outil
        e1.retourner();

        // Suppression par admin
        admin.supprimerOutil(machette, magasin);

        // Un cultivateur quitte
        c2.quitterCooperative();

        // Inventaire final
        magasin.inventaire();
    }
}
