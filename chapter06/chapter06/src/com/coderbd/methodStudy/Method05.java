/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.methodStudy;

/**
 *
 * @author Java
 */
public class Method05 {
    int x=10;
    int y= 5;
    public int makeSum(int num1 , int num2, int num3){
    int sum = num1+num2+num3;
    return sum;
    }
    
    public static void main(String[] args) {
        Method05 obj = new Method05();
        int TotalSum = obj.makeSum(obj.x, obj.y,50);
        System.out.println("The result is: " + TotalSum);
    }
    
}
