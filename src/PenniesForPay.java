import java.util.Scanner;
/** Chapter 4 Programming Challenge #4
 * @author Moses613
 */
public class PenniesForPay {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        double totalPay = 0;
        double currentPay;
        int daysWorked;

        System.out.println("Please type the number of days worked, followed by the enter key.");
        daysWorked = keyboard.nextInt();

        //input validation
        while (daysWorked < 1) {
            System.out.println("\nThe number of days must be greater than zero. Try again.");
            daysWorked = keyboard.nextInt();
        }

        //Calculate and print results
        System.out.println(""); //Skip a line
        for (int i = 1; i <= daysWorked; i++) {
            currentPay = Math.pow(2, i - 1) / 100;
            System.out.printf("Day %d: Today's pay is $%,.2f\n", i, currentPay);
            totalPay += currentPay;
        }

        System.out.printf("\nTotal Pay is $%,.2f", totalPay);
    }
}
