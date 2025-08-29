/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int []arr ={7, 10, 1, 3, 6, 9, 2};
		int max=0;
		for(int i=0;i<arr.length-1 ;i++){
		    for(int j =i+1;j<arr.length;j++){
		        max= Math.max(max,arr[j]-arr[i]);
		    }
		}
		System.out.println(max);
		
	}
}