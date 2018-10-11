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

public class SwitchStatements {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a case number: ");
        int status = sc.nextInt();
        switch (status) {
            case 0:
                System.out.println("00000000000000");
                break;
            case 1:
                System.out.println("1111111111");
                int newStatus = sc.nextInt();
                break;
            case 2:
                System.out.println("22222222222");
                break;
            case 3:
                System.out.println("3333333333333");
                break;
            default:
                System.out.println("Invalid case");

        }
    }

}
