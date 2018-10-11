/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class01;

/**
 *
 * @author Java
 */
import java.util.Scanner;
public class OddEven {
    static int number;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        number = sc.nextInt();
        if(number%2==0){
            System.out.println(number + " is an even number");
        }else{
            System.out.println(number + " is an odd number");
        }
    }
    
}
