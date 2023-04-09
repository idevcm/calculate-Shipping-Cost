package Exceptions;

/**
 * The type Maximum weight exception.
 */
public class MaximumWeightException extends Exception{

    private final String message;

    /**
     * Instantiates a new Maximum weight exception.
     */
    public MaximumWeightException(){
        message = "[!] Attention, the weight exceeds the allowed range (< 24000 Kg))";
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
