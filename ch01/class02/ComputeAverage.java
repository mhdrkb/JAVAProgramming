import java.util.Scanner;

public class ComputeAverage{
	public static void main(String[] args){
	 Scanner input = new Scanner(System.in);
		System.out.println("Enter the value of X: ");
		double x = input.nextDouble();
		System.out.println("Enter the value of Y: ");
		double y = input.nextDouble();
		System.out.println("Enter the value of Z: ");
		double z = input.nextDouble();
		double avg = (x + y + z)/3;
		System.out.println("Average of " + x + " , " + y + " and " + z + " is= " + avg);
	}
}