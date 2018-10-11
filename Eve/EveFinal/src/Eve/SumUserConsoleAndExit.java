/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Eve;

import java.util.Scanner;

/**
 *
 * @author Java
 */
public class SumUserConsoleAndExit {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        int n = 0;
           System.out.println("Please enter a Num: ");
        do {        
            n = sc.nextInt();
            sum += n;
            System.out.println("Sum: " + sum);
        } while (n != 0);
        
        System.out.println("Sum: " + sum);
    }   
}
