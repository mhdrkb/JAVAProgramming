
package Class01;

import java.math.*;
public class Factorial {
   
    
    public static void main(String[] args) {
        System.out.println("5! is \n" + factorial(5));
    }
    public static BigInteger factorial(long n){ //BigInteger is a builtin class of java math utility.
        BigInteger result = BigInteger.ONE; ///assign a constant with the value resultant value as multiply
        for(int i = 1 ; i<=n ; i++){
        result = result.multiply(new BigInteger(i + ""));
        }
    return result;
    }

    
}
