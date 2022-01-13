package HomeMenu.exception;

public class NoChildException extends RuntimeException{
    //
    private static final long serialVersionUID = 5803920661574990365L;

    public NoChildException(){

    }

    public NoChildException(String message) {
        super(message);
    }
}
