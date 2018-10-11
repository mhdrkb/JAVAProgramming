package class01;

import java.util.Scanner;

public class PassFail {

    static int obtainMark;

    /*as it is global variable and used before static main method and the main mathod is static so it
    needs to declare static before the variable name otherwise it can not be used or called in static main mathod*/

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter obtained number: ");
        obtainMark = sc.nextInt();
        
        
        if (obtainMark >= 70 && obtainMark < 80) {
            System.out.println("grade A");
        } else if (obtainMark >= 80 && obtainMark < 100) {
            System.out.println("grade A+");
        } else if (obtainMark >= 0 && obtainMark < 70) {
            System.out.println("grade F");
        } else {
            System.out.println("Invalid number");
        }
    }
}
