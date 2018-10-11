
package com.coderbd;

/**
 *
 * @author Java
 */
public class multiplicationTable {
    public static void main(String[] args) {
        System.out.println("    Multiplication Table");
        System.out.print("   ");
        for(int i=1; i<=9; i++){
            System.out.print("   "+i);
        }
        System.out.println("\n------------------------------------------------");
        
        
        for(int j=1; j<=9; j++){
            System.out.print(j + " |");
            for(int k=1; k<=9; k++){
                System.out.printf("%4d",j*k);
            }
            System.out.println();
        }
        //printing odd number except 5
        for(int p=1; p<=20; p++){
            if(p%2==1){
                if(p==5 || p==9 || p==13){
                    continue;
                }
                System.out.println(""+p);
            }
        }
    }
}
