import java.io.IOException;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {

        try {
            throwException("2");
        } catch (CustomException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();

        }

        System.out.println();

    }

    public static void  throwException(String message) throws IOException {
        if (Objects.equals(message, "1")) {
            throw new CustomException("Произошла ошибка :(");
        } else {
            throw new IOException("Input output exception");
        }
    }
}

