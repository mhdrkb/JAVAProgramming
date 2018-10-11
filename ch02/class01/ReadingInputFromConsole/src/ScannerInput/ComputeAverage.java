/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ScannerInput;

/**
 *
 * @author Java
 */
import java.util.Scanner;
public class ComputeAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three numbers : ");
        double number01 = input.nextDouble();
        double number02 = input.nextDouble();
        double number03 = input.nextDouble();
        double average = (number01+number02+number03)/3;
        System.out.println("the average og number " + number01 + ", " + number02 + " and " + number03 + " is = "+ average);
    }
 
}
