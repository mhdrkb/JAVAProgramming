package com.coderbd.methodStudy;
public class MethodExample03 {
    double balance = 5000.0; ////global/instance
    
    
    public static void main(String[] args) {
        MethodExample03 obj = new MethodExample03();
        boolean total = obj.checkBalance(4500.0);
        System.out.println("Result :" + total);
    }
    
    
    
    public boolean checkBalance(double withdraw){ ///local variable
    balance -= withdraw;
    if(balance>=1000.0){
    return true;
    }
    return false;
    }
}
