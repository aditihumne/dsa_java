// simple and recursive code

public class gcd {
    public static void main(String[] args) {
        int a=6;
        int b =12;
        System.out.println(find_gcd(a,b));
    }
    public static int find_gcd(int a, int b){
        if(b==0)
            return a;
        return find_gcd(b, a%b);
    }
}
