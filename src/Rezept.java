import java.util.Arrays;

public class Rezept {

    private String name;
    private int personen;
    private Zutat[] zutaten;

    public String getName() {
        return name;
    }

    public int getPersonen() {
        return personen;
    }

    public Zutat[] getZutaten() {
        return zutaten;
    }

    public Rezept(String name, int personen, Zutat[] zutaten) {
        this.name = name;
        this.personen = personen;
        this.zutaten = zutaten;
    }

    @Override
    public String toString() {
        return "Rezept{" +
                "name='" + name + '\'' +
                ", personen=" + personen +
                ", zutaten=" + Arrays.toString(zutaten) +
                '}';
    }

    public void printRezept() {
        System.out.println("Rezept " + name);
        for (int i = 0; i < zutaten.length ; i++) {
        System.out.println(zutaten[i]);
    }
    }
    public Rezept umrechnen(int personen) {
        Zutat[] newZutaten = this.zutaten;
    Rezept newRezept = new Rezept(this.name, this.personen * 2, this.zutaten);
    return newRezept;
   }
}
