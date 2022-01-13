package HomeMenu.exception;

public class NoTVException extends RuntimeException{
    //
    private static final long serialVersionUID = 7739884867884451421L;

    public NoTVException() {
    }

    public NoTVException(String message) {
        super(message);
    }
}
