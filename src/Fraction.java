/**
 * Fraction class with fields for numerator and denominator,
 * getters and setters, as well as some useful methods.
 */
public class Fraction
{
    private int num,
                denom;
    
    // Constructors
    public Fraction() 
    {
        num = 0;
        denom = 1;
    }
    public Fraction(int n) 
    {
        num = n;
        denom = 1;
        //this(n,1);
    }
    public Fraction(int p, int q) 
    {
        num = p;
        denom = q;
        
        reduce();  // reduces the Fraction
    }
    
    public Fraction(Fraction other) 
    {
        num = other.num;
        denom = other.denom;
    }
    
    public String toString()
    {
        return "Numerator = " + num + "\nDenominator = " + denom + "\n\n" + num + "/" + denom;
    }

    public int getNum() {
        return num;
    }

    public int getDenom()
    {
        return denom;
    }
    
    // modifier methods
    public void setNum(int numset)
    {
        num = numset;
    }
    
    public void setDenom(int denomset)
    {
       denom = denomset;
    }
    
    // Will return greatest common factor of two numbers
    // Used in reduce()
    private int gcf(int num1, int num2)
    {
        int min = Math.min(num1, num2);
        
        for (int i = min; i > 1; i--) {
            if ( (num1 % i == 0) && (num2 % i == 0) ) {
                return i;
            }
        }
        return 1;
       
    }   
    
        
    // reduces the fraction object
    public void reduce()
    {
            // Several lines of code to reduce the fraction
            // It use the gcf method to find the greatest common factor
            int reduceBy = gcf(num, denom);
            num /= reduceBy;
            denom /= reduceBy;

    }
    
    // Inverts the fraction object
    public void invert()
    {
        int temp;

        temp = num;
        num = denom;
        denom = temp;

    }

    public void print() {
        System.out.println("Numerator = " + num + "\nDenominator = " + denom + "\n" + num + "/" + denom + "\n");
    }
}
