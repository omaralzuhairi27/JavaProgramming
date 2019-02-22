package week10.MoreStreams;

public class PeekObject {
    private String message;

    public PeekObject(String message) {
        this.message = message;
        System.out.println("Constructor called for: " + message);
    }

    public String getMessage() {
        return message;
    }
}
