package es2;
import java.util.LinkedList;

public class SIM {
    private String numeroTelefono;
    private double credito;
    private LinkedList<Chiamata> ultimeChiamate;

    public SIM(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
        this.credito = 0.0;
        this.ultimeChiamate = new LinkedList<>();
    }

    public void aggiungiChiamata(Chiamata chiamata) {
        if (ultimeChiamate.size() == 5) {
            ultimeChiamate.removeFirst(); // rimuove la più vecchia
        }
        ultimeChiamate.addLast(chiamata);
    }

    public void stampaDatiSIM() {
        System.out.println("Numero telefono: " + numeroTelefono);
        System.out.println("Credito disponibile: €" + credito);
        System.out.println("Ultime chiamate:");
        if (ultimeChiamate.isEmpty()) {
            System.out.println("Nessuna chiamata effettuata.");
        } else {
            for (Chiamata c : ultimeChiamate) {
                System.out.println(c);
            }
        }
    }
}