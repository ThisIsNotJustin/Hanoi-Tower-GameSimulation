package HanoiTowerSimulation;

/**
 *
 * @author Justin Coleman
 */
public class IllegalPushException extends Exception{

    /**
     * Creates a new instance of <code>IllegalPushException</code> without detail message.
     */
    public IllegalPushException() {
        super("Error: Illegal Push");
    }


    /**
     * Constructs an instance of <code>IllegalPushException</code> with the specified detail message.
     * @param msg the detail message.
     */
    public IllegalPushException(String msg) {
        super(msg);
    }
}
