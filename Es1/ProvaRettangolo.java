package Es1;

public class ProvaRettangolo {
    public static void main(String[] args) {
        Rettangolo rett1 = new Rettangolo(5, 10);
        Rettangolo rett2 = new Rettangolo(3, 6);

        Rettangolo.stampaRettangolo(rett1);
        System.out.println();
        Rettangolo.stampaDueRettangoli(rett1, rett2);
    }
}