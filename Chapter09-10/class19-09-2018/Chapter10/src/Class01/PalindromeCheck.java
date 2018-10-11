package Class01;
public class PalindromeCheck {
    public static void main(String[] args) {
        System.out.println(PalindromWordCheck("Madam"));
        
        String[] arrs = {"Madam","Book","Eye","Apple","konok","Mom","Mehedee"};
        System.out.println(countPalindrome(arrs));
                
        String s1 = "Eye";
        String s2 = "Book";
        if(s1.equalsIgnoreCase(s2)){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
    public static boolean PalindromWordCheck(String s){
        boolean status=false;
        StringBuilder str = new StringBuilder(s);
        String newStr = String.valueOf(str.reverse());
        if(newStr.equalsIgnoreCase(s)){
        status = true;
        }
        return status;
    }
    public static int countPalindrome(String[] s){
        int counter = 0;
        for (int i= 0; i<s.length ; i++){
            if(PalindromWordCheck(s[i])){
            counter++;
            }
        }
        return counter;
    } 
}
