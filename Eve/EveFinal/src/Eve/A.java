
package Eve;

public class A {
    public A(){
        System.out.println("A");
    }
    public A(int i){
        this();
        System.out.println(i);
    }
    public static void main(String[] args) {
        new A(5);
    }
}
