/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.methodStudy;

import java.util.Scanner;

/**
 *
 * @author Java
 */
public class Method06 {
    ///////main method//////
    public static void main(String[] args) {
        Method06 obj = new Method06();
        int total = obj.SumSeries(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println("total = " + total);
        System.out.println("Total = " + obj.SumSeries(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        int forTotal = obj.SumSeries();
        System.out.println("forTotal = " + forTotal);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number x = ");
        int x = sc.nextInt();
        System.out.print("Enter Number y = ");
        int y = sc.nextInt();
        System.out.println("Complex method combination : " + obj.DifferenceTwoMethod(x, y));
    }
    
    
    public int SumSeries(int a, int b, int c, int d, int e, int f, int g, int h, int i, int j) {
        int sum = a+b+c+d+e+f+g+h+i+j;
        return sum;
    }
    public int SumSeries(){
        int total=0;
        for(int i =1; i<=10;i++){
        total += i;
        }       
        return total;
    }
    
    
    
    public int Sum(int a, int b){
    int sum = a+b;
    return sum;
    }
    public int Multi(int a, int b){
    int multiple = a*b;
    return multiple;
    }
    public int DifferenceTwoMethod(int n1, int n2){
    int total =  Multi( n1,n2)-Sum( n1, n2);
    return total;
    }
}
