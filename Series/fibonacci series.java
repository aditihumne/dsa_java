/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
	int n=10;
	fibonacci(n);
	}
	public static void fibonacci(int n){
	    int start=0;
	    int second= 1;
	    for(int i=0; i<n;i++){
	        System.out.println(start);
	        int third=start+second;
	        start=second;
	        second=third;
	        
	    }
	}
}