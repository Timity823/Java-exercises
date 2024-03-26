package avengers.exception;

public class ShipFullException extends UnsupportedOperationException {
    public ShipFullException() {
    }

    public ShipFullException(String message) {
        super(message);
    }

    public ShipFullException(String message, Throwable cause) {
        super(message, cause);
    }

    public ShipFullException(Throwable cause) {
        super(cause);
    }
}
