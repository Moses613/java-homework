import java.util.Random;

/** Homework #5 - Dice Game Die class
 * Simulates a multi-sided die
 * @author Moses613
 */
public class Die {

    private int sides;
    private int currentValue;

    /**
     * No-arg constructor assumes the die is six-sided, and performs an initial roll
     */
    public Die () {
        sides = 6;
        roll();
    }

    /** Regular constructor, takes input for the number of sides the die should have, also performs an intial roll
     * @param numSides The number of sides the die should have
     */
    public Die (int numSides) {
        sides = numSides;
        roll();
    }

    /**
     * Rolls the die
     */
    public void roll() {
        Random numeroGenerator = new Random();
        currentValue = numeroGenerator.nextInt(sides) + 1;
    }

    /** Returns the current value of the die
     *
     * @return Returns the current value of the die
     */
    public int getCurrentValue() {
        return currentValue;
    }

    /**Returns the number of sides the die was set to
     *
     * @return Returns the number of sides the die was set to
     */
    public int getSides() {
        return sides;
    }
}
