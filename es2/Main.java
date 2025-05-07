package es2;

public class Main {
    public static void main(String[] args) {
        SIM miaSim = new SIM("3331234567");

        // Simuliamo alcune chiamate
        miaSim.aggiungiChiamata(new Chiamata("3349876543", 3));
        miaSim.aggiungiChiamata(new Chiamata("3201234567", 5));
        miaSim.aggiungiChiamata(new Chiamata("3456789012", 2));
        miaSim.aggiungiChiamata(new Chiamata("3911234433", 7));
        miaSim.aggiungiChiamata(new Chiamata("3669873211", 4));
        miaSim.aggiungiChiamata(new Chiamata("3809988776", 1)); // questa sostituisce la prima

        miaSim.stampaDatiSIM();
    }
}