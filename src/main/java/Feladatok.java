import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Feladatok {
    private List<String> szavak;

    public Feladatok(List<String> szavak) {
        this.szavak = szavak;
    }

    public List<String> getSzavak() {
        return Collections.unmodifiableList(szavak);
    }

    public int szavakSzama(){
        return 0;
    }

    public int leghosszabbSzoIndexe(){
        return 0;
    }

    public int betukSzama(char betu){
        return 0;
    }

    public String csere(int index){
        return "";
    }

    public boolean egyformaSzavak(){
        return false;
    }

    public Map<Character, Integer> betuStatisztika(){
        return new HashMap<>();
    }
}
