/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	   int[] arr = {0, 1, 3, 0, 2, 2, 4, 2};
	   int ele = 2;
	   int output=0;
	   for(int i =0 ;i<arr.length-1;i++){
	       if(ele!=arr[i]){
	           output++;
	       }
	   }
	   System.out.println(output);
	
		
		
	}
}