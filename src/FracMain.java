import java.io.IOException;

public class FracMain  
{
    public static void main(String[] args) throws IOException 
    {

        boolean newOne = true;
        Fraction frac = new Fraction(); //put something in this for bug testing
        FracCalc fcalc = new FracCalc();

        System.out.println("This program performs mathematical operations on " +
                "two fractions." +
                "\nEnter the mathematical expression below the line, in this form: " +
                "x/y operator a/b" +
                "\nand then push enter. Notice the spaces." +
                "\nAfter results have been" +
                " displayed, enter 'C' to continue, and 'Q' to quit." +
                "\n(Case sensitive, and dont use negative numbers pls)" +
                "\n______________________________________________");

        /* bug testing
          Fraction frac2 = new Fraction(2,5);
          Fraction result = new Fraction();
          FracCalc fracMixer = new FracCalc();
          result = fracMixer.subtract(frac, frac2);
          frac.print();
          frac2.print();
          result.print();
           */


        //todo negative numbers break things in addition

        // code will read Fractions to compute
		while (fcalc.readEquation(newOne,frac))
           {
               frac = fcalc.computeEquation();
               frac.print();
               newOne = false;       
           }
           return;
        
    }
}

