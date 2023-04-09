package Exceptions;

/**
 * The type Negative number exception.
 */
public class NegativeNumberException extends Exception{
    private final String message;

    /**
     * Instantiates a new Negative number exception.
     *
     * @param count the counter that select the message you want to show
     */
    public NegativeNumberException(int count){

        String[] mms = new String[]{
                "[!] --> You cannot enter negative numbers",
                "[!] --> For the second time, you cannot enter negative numbers\" can be the translation of",
                "[!] --> I won't repeat it again, please stop trying to enter negative numbers"
        };

        message = mms[count];
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
