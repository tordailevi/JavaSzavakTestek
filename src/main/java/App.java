import java.util.List;

public class App {

    public static void main(String[] args) {

        List<Szo> lista = FileBeolvaso.beolvas("szavakFile.txt");
        SzoKezelo SZK = new SzoKezelo(lista);

        System.out.println("Hány szó van benne: " + SZK.hanySzo());

        System.out.println("Leghosszabb szó: " + SZK.leghosszabbSzo());

        System.out.println("Hány tartalmaz 'e'-t: " + SZK.hanyTartalmaz('e'));

        System.out.println("Csere: " + SZK.csere(0));

        System.out.println("Van egyforma szó: " + SZK.vanDuplikacio());

        System.out.println("Egy adott betűből mennyi: " + SZK.melyikBetubolMennyiAzAdottSzoban(1));

        System.out.println("A teljes szövegben melyik betűből mennyi: " + SZK.melyikBetubolMennyiATeljesSzovegben());
    }
}

