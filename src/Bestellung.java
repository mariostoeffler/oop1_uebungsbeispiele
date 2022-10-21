public class Bestellung {

    private int number;
    private Bestellzeile[] zeilen;

    public int getNumber() {
        return number;
    }

    public Bestellzeile[] getZeilen() {
        return zeilen;
    }

    public Bestellung(int number, Bestellzeile[] zeilen) {
        this.number = number;
        this.zeilen = zeilen;
    }

    public void printBestellung() {
        for (int i = 0; i < zeilen.length ; i++) {
            System.out.println("Nummer " + number + "\n" + zeilen[i].toString());
        }

    }

    public double getKosten() {
        double cost = 0;
        for (int i = 0; i < zeilen.length ; i++) {
            cost = cost + zeilen[i].getKosten();
            System.out.println("Zwischensumme = " + cost);
        }
        return cost;
    }
}
