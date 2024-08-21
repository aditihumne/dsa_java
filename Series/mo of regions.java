/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n =sc.nextInt();
	if(n==1){
	    System.out.println (2);
	}else if(n == 0){
	    System.out.println (1);
	}else{
	    int region=n*(n+1)/2+1;

	    	System.out.println(region);
	}
	
	}
}