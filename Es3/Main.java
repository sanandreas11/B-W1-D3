package Es3;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("CL001", "Mario Rossi", "mario.rossi@email.com", "2024-11-15");

        Articolo a1 = new Articolo("A001", "Mouse wireless", 25.90, 10);
        Articolo a2 = new Articolo("A002", "Tastiera meccanica", 89.99, 5);
        Articolo a3 = new Articolo("B003", "Monitor 24''", 159.99, 3);

        Carrello carrello = new Carrello(cliente);
        carrello.aggiungiArticolo(a1);
        carrello.aggiungiArticolo(a2);
        carrello.aggiungiArticolo(a3);

        carrello.stampaDettagli();
    }
}