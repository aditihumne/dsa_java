/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	   int n =1249;
	    while(n>=10){
	    int sum = 0;
		while(n>0){
		 sum=sum+n%10;
		n=n/10;
	   
	    }
	    n=sum;
	    }
	  	System.out.println(n);
	
		
		
	}
}