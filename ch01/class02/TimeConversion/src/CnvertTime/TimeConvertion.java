/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CnvertTime;

/**
 * 
 * @author Java
 */
import java.util.Scanner;
public class TimeConvertion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //prompt the user to input
        System.out.println("Enter a integer for Second: ");
        int second = input.nextInt();
        int minutes = second/60; //Find minute;
        int remainingSecond = second % 60; //Remaining seconds(the rest valus after dividing by 60);
        System.out.println(second + " second is " + minutes + " minutes and " + remainingSecond + " seconds");
    }
}
