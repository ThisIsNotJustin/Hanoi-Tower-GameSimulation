package HanoiTowerSimulation;

import java.util.Scanner;
/**
 * Driver Code for Tower of Hanoi Game
 * @author Justin Coleman
 */
public class HanoiTowerGame {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Welcome to Justin Coleman's Tower of Hanoi "
                + "Simulator");
        String choice = "";
        // do while user inputs Y or y
        do {
        System.out.println("Please enter the number of discs you'd like to use "
                + "for the game");
        int numDiscs = userInput.nextInt(); // accept input for number of discs
        // create game object and simulate it
        HanoiSimulation game = new HanoiSimulation(numDiscs); 
        game.runSim();
        System.out.println("Would you like to run another simulation (Y/N): ");
        choice = userInput.next();
        } while (choice.compareToIgnoreCase("Y") == 0);
        
        System.out.println("Thank you for using the Tower of Hanoi Simulator");
    }

}
