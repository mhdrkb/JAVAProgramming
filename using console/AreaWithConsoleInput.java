import java.util.Scanner;
public class AreaWithConsoleInput{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a Radius");
		double radius = input.nextDouble();
		double area = radius * radius * 3.1416;
		System.out.println("The area for the circle of radius is " + radius + " is " + area);		
	}
}