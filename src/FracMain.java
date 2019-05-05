import java.io.IOException;

public class FracMain  
{
    public static void main(String[] args) throws IOException 
    {

           boolean newOne = true;
           Fraction frac = new Fraction(2,5); //should be empty
           FracCalc fcalc = new FracCalc();
            /*
           Fraction frac2 = new Fraction(2,5);
           Fraction result = new Fraction();
           FracCalc mixer = new FracCalc();
           result = mixer.add(frac, frac2);
           frac.print();
           frac2.print();
           */
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

