package exceptions.task_four;

public class CheckEmailFormatException extends RuntimeException{

    public CheckEmailFormatException(String message) {
        super(message);
    }
}
