import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Reader {

    String read() {
        String result = "";
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            result = br.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return result;
    }
}
