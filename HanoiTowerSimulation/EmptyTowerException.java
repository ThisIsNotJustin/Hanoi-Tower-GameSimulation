package HanoiTowerSimulation;


/**
 *
 * @author Justin Coleman
 */
public class EmptyTowerException extends Exception {

    /**
     * Creates a new instance of <code>EmptyTowerException</code> without detail message.
     */
    public EmptyTowerException() {
        super("Error: Tower is empty");
    }


    /**
     * Constructs an instance of <code>EmptyTowerException</code> with the specified detail message.
     * @param msg the detail message.
     */
    public EmptyTowerException(String msg) {
        super(msg);
    }
}
