
package Eve;


public class Test {
    public static void main(String[] args) {
        new A(10);
        //here executes the inherited result of A throuhg the Class B.
        new B(5);
        
        //use of escape sequence
        System.out.println("Hi,\tI am mehedee");
        
    }
}
