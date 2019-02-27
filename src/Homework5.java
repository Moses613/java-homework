import java.util.Scanner;

/** Homework #5 - Dice Game main class
 * @author Moses613
 */
public class Homework5 {

    public static void main(String[] args) {
        //Creates the dice
        Die computerDie = new Die(6);
        Die userDie = new Die(6);

        int userScore = 0; //Tracks the total matches won by the user
        int computerScore = 0; //Tracks the total matches won by the computer

        Scanner input = new Scanner(System.in); //So that the user can progress the game by pushing enter

        System.out.println("Now starting the ten-round Dice Game(TM)...\n\n");
        //runs ten rounds of the dice game
        for (int i = 0; i < 10; i++ ) {
            //Roll dice
            computerDie.roll();
            System.out.println("The computer rolled: " + computerDie.getCurrentValue() + "\n");
            System.out.print("It's your turn! Press enter to roll your die.\n");
            input.nextLine(); //The user pushes enter to initiate die rolling
            userDie.roll();
            System.out.println("The user rolled: " + userDie.getCurrentValue());

            //Compute results
            if (computerDie.getCurrentValue() > userDie.getCurrentValue()){
                System.out.println("The computer has won the match.");
                computerScore++;
            }
            else if (userDie.getCurrentValue() > computerDie.getCurrentValue()) {
                System.out.println("The user has won the match.");
                userScore++;
            }
            else { //For a tie
                System.out.println("The match ended in a tie.");
            }

            //Display round progression message assuming the ten rounds have not yet been completed
            if (i != 9) {
                System.out.println("\nPress enter to progress to Round " + (i + 2));
                input.nextLine();
            }

        }

        //Display final results
        System.out.println("\n\n***Final Results*** \n");
        System.out.println("The user won " + userScore + " matches.");
        System.out.println("The computer won " + computerScore + " matches.");

        if (userScore > computerScore) {
            System.out.println("\nCongratulations! You've won the Dice Game(TM)!!");
        }
        else {
            System.out.println("\nYou would appear to have lost... Better luck next time.");
        }


    }


}
