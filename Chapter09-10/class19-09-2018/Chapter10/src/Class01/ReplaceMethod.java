package Class01;

public class ReplaceMethod {

    public static void main(String[] args) {
        System.out.println("Hi, ABC, good".matches("ABC ")); ///regular expression
        System.out.println("Hi, ABC, good".matches(".*ABC.*"));
        System.out.println("A,B;C".replaceAll(",;", "#"));
        System.out.println("A,B;C".replaceAll("[,;]", "#"));
        String[] tokens = "A,B;C".split("[,;]");
        for (int i = 0; i < tokens.length; i++) {
            System.out.println(tokens[i] + " ");
        }
        String s = "Hi, Good Morning";
        System.out.println(m(s));

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Welcome");
        stringBuilder.append(' ');
        stringBuilder.append("to");
        stringBuilder.append(' ');
        stringBuilder.append("Java");

        System.out.println(stringBuilder);
        System.out.println(stringBuilder.delete(8, 11));
        System.out.println(stringBuilder.deleteCharAt(8));
        System.out.println(stringBuilder.reverse());
        System.out.println(stringBuilder.replace(11, 15, "HTML"));
        stringBuilder.setCharAt(0, 'W');
        System.out.println(stringBuilder);
    }

    public static int m(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i)));
            count++;
        }
        return count;
    }
}
