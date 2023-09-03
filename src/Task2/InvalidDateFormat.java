package Task2;

public class InvalidDateFormat extends UnsupportedOperationException {
    private static final String MESSAGE = "Неверный формат Даты рождения";

    public InvalidDateFormat(){
        this(MESSAGE);
    }

    public InvalidDateFormat(String message) {
        super(message);
    }
}
