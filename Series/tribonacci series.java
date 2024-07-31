/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
	    int n = 20;
		tribonacci(n);
	}
	public static void  tribonacci(int n){
	    int first=0;
	    int second = 0;
	    int third = 1;
	    for(int i =0 ; i<n ; i++){
	        System.out.println(first);
	        int forth = first+second+third ;
	        first = second;
	        second= third;
	        third = forth;
	    }
	    
	}
}