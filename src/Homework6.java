import java.io.*;
import java.util.Scanner;
/** Homework #6 - World Series Champions
 * @author Moses613
 */
public class Homework6 {

    public static void main(String[] args) throws IOException {
        int timesWon = 0;
        String[] array = createStringArray("src/WorldSeriesWinnersHwk6.txt");
        Scanner input = new Scanner(System.in);

        System.out.println("This program displays the number of times an inputted team has won" +
                " the World Series.\n");
        System.out.println("Please enter the name of the team you wish to search for.");
        System.out.println("Do not include the word \"the\".");
        String team = input.nextLine();
        timesWon = search(array, team);

        System.out.println("The team \"" + team + "\" has won " + timesWon + " times.");

    }

    /**Reads the input file into a String array
     * @param filePath The relative path of the input file
     * @return A String array containing the data from the input file
     * @throws IOException
     */
    public static String[] createStringArray (String filePath) throws IOException {
        File file = new File(filePath);
        Scanner fileScanner = new Scanner(file);
        int totalLines = 0;

        //Scans file to see how many elements are needed in the String[]
        while (fileScanner.hasNext()) {
            fileScanner.nextLine();
            totalLines++;
        }
        //Reset Scanner to the beginning of the file
        fileScanner.close();
        fileScanner = new Scanner(file);

        String[] stringArray = new String[totalLines];
        for (int counter = 0; counter < stringArray.length; counter++) {
            stringArray[counter] = fileScanner.nextLine();
        }
        fileScanner.close();

        return stringArray;
    }

    public static int search(String[] array, String team) {
        int timesWon = 0;

        for (int counter = 0; counter < array.length; counter++) {
            if (team.equalsIgnoreCase(array[counter])) {
                timesWon++;
            }
        }

        return timesWon;
    }
}
