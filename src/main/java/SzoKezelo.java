import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class SzoKezelo {
    private List<Szo> szoLista;

    public SzoKezelo(List<Szo> lista) {
        this.szoLista = lista;
    }

    public int hanySzo() {
        return szoLista.size();
    }

    public String leghosszabbSzo() {
        Szo max = szoLista.get(0);

        for (Szo s : szoLista) {
            if (s.hossz() > max.hossz()) {
                max = s;
            }
        }

        return max.getSzo();
    }

    public int hanyTartalmaz(char c) {
        int db = 0;

        for (Szo s : szoLista) {
            if (s.tartalmaz(c)) {
                db++;
            }
        }

        return db;
    }

    public String csere(int index) {
        return szoLista.get(index).elsoUtolsoCsere();
    }

    public boolean vanDuplikacio() {
        HashSet<String> halmaz = new HashSet<>();

        for (Szo s : szoLista) {
            halmaz.add(s.getSzo());
        }

        return halmaz.size() != szoLista.size();
    }

    public HashMap<String, Integer> melyikBetubolMennyiAzAdottSzoban(int szoIndex) {
        String szo = szoLista.get(szoIndex).getSzo();
        HashMap<String, Integer> betukMennyisege = new HashMap<>();

        for (int i = 0; i < szo.length(); i++) {
            String betu = String.valueOf(szo.charAt(i));

            if (betukMennyisege.containsKey(betu)) {
                betukMennyisege.put(betu, betukMennyisege.get(betu) + 1);
            } else {
                betukMennyisege.put(betu, 1);
            }
        }

        return betukMennyisege;
    }

    public HashMap<String, Integer> melyikBetubolMennyiATeljesSzovegben() {
        HashMap<String, Integer> betukMennyisege = new HashMap<>();

        for (int j = 0; j < szoLista.size(); j++) {
            String szo = szoLista.get(j).getSzo();

            for (int i = 0; i < szo.length(); i++) {
                String betu = String.valueOf(szo.charAt(i));

                betukMennyisege.put(betu, betukMennyisege.getOrDefault(betu, 0) + 1);
            }
        }

        return betukMennyisege;
    }
}

