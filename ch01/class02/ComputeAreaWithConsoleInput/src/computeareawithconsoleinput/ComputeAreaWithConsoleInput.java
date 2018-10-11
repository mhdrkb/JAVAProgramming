
package computeareawithconsoleinput;

import java.util.Scanner;
public class ComputeAreaWithConsoleInput {

    public static void main(String[] args) {
        //create a scanner object
        Scanner input = new Scanner(System.in);
        //prompt the user to enter a radius
        System.out.println("Enter a number for radius : ");
        double radius = input.nextDouble();
        
        //compute area
        
        double area = 3.1416 * radius * radius;
        System.out.println("The area of the circle of radius " + radius + " is " + area);
        
    }
    
}
