
package sumwithprompt;

import java.util.Scanner;

public class SumWithPrompt {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of X: ");
		int x = sc.nextInt();
		System.out.println("Enter the value of Y: ");
		int y = sc.nextInt();
		int sum = x + y;
		System.out.println("Sum of " + x + " and " + y + " is= " + sum);
    }
    
}
