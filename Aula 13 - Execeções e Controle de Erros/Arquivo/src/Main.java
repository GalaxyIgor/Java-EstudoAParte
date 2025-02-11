import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        try {
            FileInputStream file = new FileInputStream("configuracao.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
