package Task2;

public class InvalidGenderFormat extends UnsupportedOperationException{
    private static final String MESSAGE = "Неверный формат пола";
    public InvalidGenderFormat() {
        this(MESSAGE);
    }

    public InvalidGenderFormat(String message) {
        super(message);
    }


}
