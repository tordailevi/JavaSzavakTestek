
public class Szo {
    private String szo;

    public Szo(String szo) {
        this.szo = szo;
    }

    public String getSzo() {
        return szo;
    }

    public int hossz() {
        return szo.length();
    }

    public boolean tartalmaz(char c) {
        return szo.indexOf(c) != -1;
    }

    public String elsoUtolsoCsere() {
        if (szo.length() < 2) return szo;

        char[] karakterek = szo.toCharArray();

        char temp = karakterek[0];
        karakterek[0] = karakterek[karakterek.length - 1];
        karakterek[karakterek.length - 1] = temp;

        return String.valueOf(karakterek);
    }
}