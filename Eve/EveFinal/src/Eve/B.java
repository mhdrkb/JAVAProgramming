
package Eve;

public class B extends A {
    public B(){
        System.out.println("B");
    }
    public B(int i){
        this();
        System.out.println(i+3);
    }
    public static void main(String[] args) {
        B b = new B(5);
    }
}
