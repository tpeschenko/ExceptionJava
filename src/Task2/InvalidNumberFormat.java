package Task2;

public class InvalidNumberFormat extends UnsupportedOperationException{
    private static final String MESSAGE = "Неверный формат Номера";

    public InvalidNumberFormat(){
        this(MESSAGE);
    }

    public InvalidNumberFormat(String message) {
        super(message);
    }
}
