package Eve;

public class Loop {

    public static void main(String[] args) {
        int k=100;
        int j = 5;
        int x=0;
        int y=11;
        for (int i = 0; i < j; i++) {
            if (i <= j--) {
                System.out.print((i * j) + " " + "\n");
            }
        }
        for(int i =1 ; i<=k; i++){
        if(i<=k--){
            System.out.println(i + "*" + k + " = " + (i*k));
        }
        }
        for(int i =1 ; i<=100; i++){
        
            System.out.println(i + "*" + k + " = " + (i*k));
        
        }
        /*do{
            System.out.println(x);
        }while(x++<y);
        System.out.println(x);*/
    }
}
