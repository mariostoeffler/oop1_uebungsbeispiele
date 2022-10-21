public class BestellungDemo {
    public static void main(String[] args) {

        Bestellzeile bestellzeile1 = new Bestellzeile("tisch", 1, 123);
        Bestellzeile bestellzeile2 = new Bestellzeile("lampe", 2, 24);
        Bestellzeile bestellzeile3 = new Bestellzeile("Kabel", 5, 24);

        Bestellzeile[] arrayofbestellzeilen = {bestellzeile1, bestellzeile2, bestellzeile3};
        Bestellung bestellung1 = new Bestellung(1, arrayofbestellzeilen);

        bestellung1.printBestellung();

        System.out.println(bestellung1.getKosten());

    }
}



