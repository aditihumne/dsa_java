import java.util.Scanner;

public class passwordCheck {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter size");
            int n = sc.nextInt();
            System.out.println("Enter password");
            String s = sc.next();
            System.out.println(checkPassword(s,n));
        }
    }
    public static int checkPassword(String s, int n){
        if(n<4){
            return 0;
        }
        if(s.charAt(0)>=0 && s.charAt(0)<=9){
            return 0;
        }
        int cap=0;
        int num =0;
        for(int i=0 ;i<n;i++){
            if(s.charAt(i)==' ' || s.charAt(i)=='/'){
                return 0;
            }
            if(s.charAt(i)>='A' && s.charAt(i)<='Z'){
                cap+=1;
            }
            else if(s.charAt(i)>=0 && s.charAt(i)<=9){
                num+=1;
            }
        }
        if(cap>0 && num>0){
            return 1;
        }else
         return 0;
    }
}