import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class FeladatokTest {

    static List<Szo> szavak;
    SzoKezelo szokezelo;

    @BeforeAll
    static void feltolt(){
        szavak = new ArrayList<>();

        szavak.add(new Szo("alma"));
        szavak.add(new Szo("korte"));
        szavak.add(new Szo("banan"));
        szavak.add(new Szo("alma"));
    }

    @BeforeEach
    void setUp() {
        szokezelo = new SzoKezelo(szavak);
    }

    @Test
    void szavakSzama() {
        assertEquals(4, szokezelo.hanySzo());
    }

    @Test
    void leghosszabbSzoIndexe() {
        assertEquals("korte", szokezelo.leghosszabbSzo());
    }

    @Test
    void betukSzama() {
        assertEquals(3, szokezelo.hanyTartalmaz('a'));
    }

    @Test
    void csere() {
        assertEquals("alma", szokezelo.csere(0));
        assertEquals("eortk", szokezelo.csere(1));
    }

    @Test
    void egyformaSzavak() {
        assertTrue(szokezelo.vanDuplikacio());
    }

    @Test
    void betuStatisztika() {
        HashMap<String, Integer> betuStatisztika = szokezelo.melyikBetubolMennyiAzAdottSzoban(0);
        assertEquals(2, betuStatisztika.get("a"));
        assertEquals(1, betuStatisztika.get("l"));
        assertEquals(1, betuStatisztika.get("m"));
    }

    @Test
    void teljesSzovegBetuStatisztika() {
        HashMap<String, Integer> teljesSzovegStat = szokezelo.melyikBetubolMennyiATeljesSzovegben();

        assertEquals(6, teljesSzovegStat.get("a"));
        assertEquals(2, teljesSzovegStat.get("l"));
        assertEquals(2, teljesSzovegStat.get("m"));
    }
}