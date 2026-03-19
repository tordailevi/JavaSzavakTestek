import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class FileBeolvaso {

    public static List<Szo> beolvas(String fajlNev) {
        try {
            String tartalom = Files.readString(Path.of(fajlNev));

            String[] szavak = tartalom.split(",");

            List<Szo> lista = new ArrayList<>();

            for (String s : szavak) {
                lista.add(new Szo(s.trim()));
            }

            return lista;

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}