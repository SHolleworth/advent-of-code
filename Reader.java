package aoc;
import java.io.BufferedReader;
import java.io.FileReader;

public class Reader {

    public String read(String path) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            try {
                StringBuilder sb = new StringBuilder();
                String line = br.readLine();
                while (line != null) {
                    sb.append(line);
                    sb.append(System.lineSeparator());
                    line = br.readLine();
                }
                return sb.toString();
            } finally {
                br.close();
            }
        } catch(Exception e) {
            System.out.println(e);
        }
        return "";
    }
}
