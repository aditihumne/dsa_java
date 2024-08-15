import java.util.Arrays;

public class rootofEquation {
    public static void main(String[] args){
        int a=1;
        int b=-2;
        int c=3;
        System.out.println(Arrays.toString(FindRoot(a,b,c)));
    }
    public static double[] FindRoot(int a, int b, int c){
        double root1=(-b+Math.sqrt((b*b)-(4*a*c)))/2*a;
        double root2=(-b-Math.sqrt((b*b)-(4*a*c)))/2*a;
        return new double[] {root1,root2};
    }
}
