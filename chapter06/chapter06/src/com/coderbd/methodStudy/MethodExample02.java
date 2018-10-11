
package com.coderbd.methodStudy;
public class MethodExample02 {
    public static void main(String[] args) {
        
        //calling display() (void type) method with static area directly
        display();
        
        //calling display() (void type) method creating object without static area
        MethodExample02 m = new MethodExample02();
        m.display2();/*/// it is not a static method and called with object properties and this method can not be called
                     without createing object cause it is not a static method but called in static main method*/
        m.display(); /// it is a static method it can be called but recomended to use direct(with class reference) access.
        
        ///Calling static method in 2nd way
        MethodExample02.display(); ///calling without instant shade.
        
    }
    
    
    
    
    
    /////////////////////////////User defined methods////////////////
    public static void display(){
        System.out.println("I am void type");
    }
    public void display2(){
        System.out.println("I am void type");
    }
}
