package EvedancePractise;

/**
 *
 * @author Java
 */
import java.util.Scanner;

public class SummingASeries {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /////////Enter two number
        System.out.println("ENter First number: ");
        int x = input.nextInt();
        System.out.println("ENter Second number: ");
        int y = input.nextInt();

        ///////creating objects
        SummingASeries obj = new SummingASeries();

        //////calling summing series method
        int resultSeris = obj.AddSeries(x, y);
        System.out.printf("The sum of %d to %d is : %d \n", x, y, resultSeris);

        //////calling sum  method two add two number
        int sumResult = obj.Sum(x, y);
        System.out.printf("The sum of %d and %d is : %d \n", x, y, sumResult);

        //////calling sub method for substruction
        int subResult = obj.Sub(x, y);
        System.out.printf("The Substruction of %d and %d is : %d \n", x, y, subResult);

        //////calling multiple method for multiplication
        int mulResult = obj.Multiple(x, y);
        System.out.printf("The Multiplication of %d and %d is : %d \n", x, y, mulResult);

        /////////Enter two number
        System.out.println("New combine operation");
        System.out.println("ENter First number: ");
        int a = input.nextInt();
        System.out.println("ENter Second number: ");
        int b = input.nextInt();
        System.out.println("ENter An Operator: ");
        String symbol = input.toString();
        int combine = obj.AALL(a, b, symbol);
        System.out.printf("The result of %d , %d and %s is %d",a,b,symbol,combine);
    }

    public static int AddSeries(int a, int b) {
        int sum = 0;
        if (a < b) {
            for (int i = a; i <= b; i++) {
                sum += i;
            }
        } else if (a > b) {
            for (int j = a; j >= b; j--) {
                sum += j;
            }
        } else if (a == b) {
            sum = a;
        }
        return sum;
    }

    public static int Sum(int a, int b) {
        int result = a + b;
        return result;
    }

    public static int Sub(int a, int b) {
        int sub = 0;
        sub = a - b;
        return sub;
    }

    public static int Multiple(int a, int b) {
        int multiResult = a * b;
        return multiResult;
    }

    public static int AALL(int a, int b, String str) {
        int rs = 0;
        if (str == "+") {
            rs = a + b;
        }
        if (str == "-") {
            rs = a - b;
        }
        if (str == "*") {
            rs = a * b;
        }
        if (str == "/") {
            rs = a / b;
        }
        if (str == "%") {
            rs = a % b;
        }
        return rs;
    }
}
