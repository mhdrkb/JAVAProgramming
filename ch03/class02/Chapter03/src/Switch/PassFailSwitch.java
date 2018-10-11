/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Switch;

/**
 *
 * @author Java
 */
import java.util.Scanner;
public class PassFailSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Marks : ");
        int marks = sc.nextInt();
        /*switch(){
        
        }*/
        System.out.println((marks % 2 == 0) ? "Number is even" : "Number is odd");
        int i;
        int sum=0;
        
        for(i=0 ; i<=10 ; i++){
            sum = sum + i;
        }
        System.out.println("The summation of 1 to 10 is = " + sum);
        System.out.println(Math.rint(4.2));
        System.out.println(Math.rint(4.5));
        System.out.println(Math.rint(4.501));
        System.out.println(Math.rint(3.501));
        System.out.println(Math.rint(3.5));
        System.out.println(Math.rint(3.4));
    }
    
}
