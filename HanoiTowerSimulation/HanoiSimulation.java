package HanoiTowerSimulation;

/**
 * methods for simulating the Tower of Hanoi Game
 * @author Justin Coleman
 */
public class HanoiSimulation {
    // private instance variables
    private int totalDiscs; // total discs in game
    private HanoiTower rod1; // rod 1
    private HanoiTower rod2; // rod 2
    private HanoiTower rod3; // rod 3
    
    // 1 argument constructor to initialize total discs and each rod
    public HanoiSimulation(int numDiscs) {
        this.totalDiscs = numDiscs;
        rod1 = new HanoiTower(numDiscs, "A");
        rod2 = new HanoiTower(numDiscs, "B");
        rod3 = new HanoiTower(numDiscs, "C");
        try {
            // add disc to rod in decreasing order
            for (int i = totalDiscs; i >= 1; i--) {
                rod1.push(i);
            }
        } catch (TowerOverflowException e) {
            System.out.println(e); // print overflow exception if needed
        } catch (IllegalPushException f) {
            System.out.println(f); // print illegal push exception if needed
        }
        
    }
    
    // public void runSim method to simulate the game by calling the 
    // display method and moveDiscs method with the initialized towers 
    // and total discs
    public void runSim() {
        displayTowers();
        moveDiscs(rod1, rod3, rod2, totalDiscs);
            
    }
        
    // private void moveDiscs method accepting 3 HanoiTower objects and
    // an int representing a disc to move
    private void moveDiscs(HanoiTower source, HanoiTower destination, 
            HanoiTower aux, int moveDisc) {
        // if the disc to move = 1, pop the source and push it to 
        // the destination and call displayTowers
        if (moveDisc == 1) {
            try {
                destination.push(source.pop());
                displayTowers();
            } catch (EmptyTowerException e) {
                System.out.println(e);
            } catch (TowerOverflowException f) {
                System.out.println(f);
            } catch (IllegalPushException g) {
                System.out.println(g);
            }
        } else {
            // move from source to aux using destination as aux with n-1
            moveDiscs(source, aux, destination, moveDisc-1);
            // this is functionally the same as rewriting the initial if block
            moveDiscs(source, destination, aux, 1);
            // move from aux to destination using source as aux with n-1
            moveDiscs(aux, destination, source, moveDisc-1); 
        }
    }
        
    // private void method to display the towers in the game
    private void displayTowers() {
        System.out.printf("( %s,%s,%s)\n", rod1.toString(), rod2.toString(), 
                rod3.toString());
    }
}
