package Exceptions;

/**
 * The type Incorrect number exception.
 */
public class IncorrectNumberException extends Exception{
    private final String message;

    /**
     * Instantiates a new Incorrect number exception.
     */
    public IncorrectNumberException(){
        message = "[!] You must enter at least one item so we can assist you";
    }

    /**
     * Instantiates a new Incorrect number exception.
     *
     * @param message the message you want to show
     */
    public IncorrectNumberException(String message){
        this.message = message;

    }
    /**
     * Gets the current message.
     *
     * @return the message
     */
    public String getMessage() {
        return message;
    }
}
