public class Zutat {

    private String name;
    private int menge;


    public String getName() {
        return name;
    }

    public int getMenge() {
        return menge;
    }

    public Zutat(String name, int menge) {
        this.name = name;
        this.menge = menge;
    }

    @Override
    public String toString() {
        return name + " " +
                menge;
    }

}
