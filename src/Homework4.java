import java.util.Scanner;
public class Homework4 {

    public static void main(String[] args) {

        double radius = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("This program creates a Circle object. Please type in a number for the " +
                "circle's radius, then push enter.");
        radius = input.nextDouble();
        Circle circle = new Circle(radius);

        System.out.println("The circle's area is: " + circle.getArea());
        System.out.println("The circle's diameter is: " + circle.getDiameter());
        System.out.println("The circle's circumference is: " + circle.getCircumference());
    }
}
