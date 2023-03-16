package HanoiTowerSimulation;


/**
 * methods for the HanoiTower class
 * @author Justin Coleman
 */
public class HanoiTower {
    // private instance variables
    private int[] discs; // array of discs on a rod
    private int numDiscs; // number of discs on the rod
    private String nameOfRod; // name of the rod
    
    // 2 argument constructor
    public HanoiTower(int maxDiscs, String nameOfRod) {
        // initialize instance variables
        discs = new int[maxDiscs];
        this.numDiscs = 0;
        this.nameOfRod = nameOfRod;
    }
    
    // public void push method taking an int disc and adding to the array
    // or throwing respective exception
    public void push(int disc) throws TowerOverflowException, 
            IllegalPushException {
        // if array is full throw overflow exception
        if (this.numDiscs == discs.length) {
            throw new TowerOverflowException();
        }
        // if there is 1 or more discs on the rod and the top disc is smaller
        // than the disc we are adding then throw push exception
        if (this.numDiscs > 0 && discs[numDiscs - 1] < disc) {
            throw new IllegalPushException();
        }
        // otherwise add the disc to the array and increment the number of discs
        discs[numDiscs] = disc;
        numDiscs++;
        
    }
    
    // public int pop method
    public int pop() throws EmptyTowerException {
        // if there are no discs on the rod throw empty tower exception
        if (numDiscs == 0) {
            throw new EmptyTowerException();
        }
        // otherwise decrement number of discs and return the value
        // of the top disc
        numDiscs--;
        return discs[numDiscs];
    }
    
    // public string method
    @Override
    public String toString() {
        String discsAsString = String.format("Rod %s: ", this.nameOfRod);
        // iterate through the array and add the value of each disc on the rod
        // to the formatted string
        for (int i = 0; i < numDiscs; i++) {
            discsAsString += discs[i] + " ";
        }
        // return the string
        return discsAsString;
    }
    
    
    
}
