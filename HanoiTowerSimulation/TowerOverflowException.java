package HanoiTowerSimulation;

/**
 *
 * @author Justin Coleman
 */
public class TowerOverflowException extends Exception{

    /**
     * Creates a new instance of <code>TowerOverflowException</code> without detail message.
     */
    public TowerOverflowException() {
        super("Error: Tower is full");
    }


    /**
     * Constructs an instance of <code>TowerOverflowException</code> with the specified detail message.
     * @param msg the detail message.
     */
    public TowerOverflowException(String msg) {
        super(msg);
    }
}
