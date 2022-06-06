import java.io.IOException;

public class CustomException extends NullPointerException {
    private String message;
    public CustomException(String message) {
        this.message = message;
    }

    public  String getMessage() {
        return "Ошибка = " + message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
