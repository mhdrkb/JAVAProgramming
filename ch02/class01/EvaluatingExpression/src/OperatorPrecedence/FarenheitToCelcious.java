/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OperatorPrecedence;

/**
 *
 * @author Java
 */
import java.util.Scanner;
public class FarenheitToCelcious {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a degree in farenheit : ");
        double farenheit = input.nextDouble();
        double celsius = (5.0 / 9) * (farenheit - 32);
        System.out.println("Farenheit " + farenheit + " is " + celsius + " in celsius." );
        double x =5/9;
        double y =5.0/9;
        System.out.println(x);
        System.out.println(y);
    }
}
