public class lcm {
    public static void main(String[] args) {
        int a=44;
        int b =66;
        System.out.println(find_lcm(a,b));
    }
    public static int find_lcm(int a, int b){
        return a*b /find_gcd(a, b);
    }
    public static int find_gcd(int a, int b){
        if(b==0)
            return a;
        return find_gcd(b, a%b);
    }
}
