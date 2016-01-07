package arithematic;

/**
 * Created by razor on 8/29/15.
 */
public class EmptyListException extends RuntimeException {
    private static final long serialVersionUID = 6769829250639411880L;

    /**
     * Constructs a <code>EmptyListException</code> with <tt>null</tt>
     * as its error message string.
     */
    public EmptyListException() {
        super();
    }

    /**
     * Constructs a <code>EmptyListException</code>, saving a reference
     * to the error message string <tt>s</tt> for later retrieval by the
     * <tt>getMessage</tt> method.
     *
     * @param   s   the detail message.
     */
    public EmptyListException(String s) {
        super(s);
    }
}
