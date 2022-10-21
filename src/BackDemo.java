

public class BackDemo {

    public static void main(String[] args) {
        Zutat mehl = new Zutat("Mehl", 500);
        Zutat eier = new Zutat("Eier", 10);
        Zutat milch = new Zutat("Milch", 1);
        Zutat kakao = new Zutat("Kakao", 125);

        Zutat[] eierArray = {mehl, milch, eier};
        Zutat[] kakaoArray = {milch, kakao};

        Rezept omlett = new Rezept("Omletten", 2, eierArray );
        Rezept trinkKakao = new Rezept("Trinkkakao", 1, kakaoArray );

        omlett.printRezept();

        System.out.println(omlett.umrechnen(3));
    }


}
