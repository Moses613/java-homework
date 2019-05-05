import java.io.IOException;
import java.util.Scanner;

public class FracCalc 
{
    
    Scanner console = new Scanner(System.in);
        
    private Fraction frac1,frac2;
    private char operator;
    
    private Fraction readFrac() throws IOException 
    {
        Fraction frac;
        int num=0;
        int denom=1;
        char c;
        
        c = (char) System.in.read();
        while (Character.isWhitespace(c))
            c = (char) System.in.read();
        if (Character.isDigit(c))
        {
            while (Character.isDigit(c))
            {
                num = num*10 + Character.digit(c,10);
                c = (char) System.in.read();
            }
            if (c == '/')
            {
                denom = 0;
                c = (char) System.in.read();
                while (Character.isDigit(c))
                {
                    denom = denom*10 + Character.digit(c,10);
                    c = (char) System.in.read();
                }
             
             } 
        }
        frac = new Fraction(num,denom);
        return frac;
    }
    
    private char readOp() throws IOException
    {
        char op = (char) System.in.read();
        
        while (Character.isWhitespace(op))
            op = (char) System.in.read();
        return op;
    }
    
    public boolean readEquation(boolean newOne, Fraction frac) throws IOException
    {
        if (newOne)
            frac1 = readFrac();
        else
            frac1 = frac;
        operator = readOp();
        while  (operator == 'C')
        {
            frac1 = readFrac();
            operator = readOp();
        }
        if (operator == 'Q')
            return false;
        frac2 = readFrac();
        return true;
       
            
    }
       
    public  Fraction add(Fraction f1, Fraction f2) //change to private
    {
        Fraction result = new Fraction();
        
        lcdConverter(f1, f2);
        result.setDenom(f1.getDenom());
        result.setNum(f1.getNum() + f2.getNum());
        result.reduce();  
        return result;
    }     
    
    private Fraction subtract(Fraction f1, Fraction f2)
    {
        Fraction result = new Fraction();
        
        
        // Subtract f1 by f2 and place result in result
        // then return the Fration named result ( done for you 	  	   //at end)
        result.reduce();  
        return result;
    }
    
    private Fraction multiply(Fraction f1, Fraction f2)
    {
        Fraction result = new Fraction();  
        
        // Multiply  f1 & f2 and place result in result
        // then return the Fration named result ( done for you     	  // at end)result.reduce();  
        return result;
    }
    
    private Fraction divide(Fraction f1, Fraction f2)
    {
        Fraction result = new Fraction();
        
        // Divide  f1 by f2 and place result in result
        // then return the Fration named result ( done for you   	   // at end)
        
        result.reduce();  
        return result;
    }
    
    public Fraction computeEquation()
    {
        Fraction answer = new Fraction();
        
        // Use an if..else if or a switch to check the operator
        // and then call the appropriate method to compute the  	   // equation
        // into answer.
        return answer;
    }

    /**
     * This method converts the two fraction objects into two fractions of the same denominator, enabling addition
     * and / or subtraction to take place. Uses the concept of "Least Common Denominator"
     * @param f1 First Fraction object
     * @param f2 Second Fraction object
     */
    private void lcdConverter(Fraction f1, Fraction f2) {
        f1.setNum(f1.getNum() * f2.getDenom());
        f2.setNum(f2.getNum() * f1.getDenom());

        int lcd = f1.getDenom() * f2.getDenom(); //This techinically will not always be the LCD, but this suits the purpose
        f1.setDenom(lcd);
        f2.setDenom(lcd);

    }
}                  