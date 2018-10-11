
package com.mhd;

public class TestStack {
    public static void main(String[] args) {
        
        GenericStack<Alu> aluList = new GenericStack<>();
        System.out.println("Now size: " + aluList.getSize());
        aluList.push(new Alu(10,"LAL"));
        aluList.push(new Alu(20,"SADA"));
        aluList.push(new Alu(30,"HOLUD"));
        System.out.println("Now size: " + aluList.getSize());
        System.out.println("peek : " + aluList.peek());
        /*GenericStack<Integer> liStack = new GenericStack<>();
        liStack.push(100);
        liStack.push(200);
        liStack.pop();
        System.out.println(liStack.peek());*/
    }
 
}
