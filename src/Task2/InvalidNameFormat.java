package Task2;

public class InvalidNameFormat extends UnsupportedOperationException{
    private static final String MESSAGE = "Неверный формат ИМЕНИ";

    public InvalidNameFormat(){
        this(MESSAGE);
    }

    public InvalidNameFormat(String message) {
        super(message);
    }
}
