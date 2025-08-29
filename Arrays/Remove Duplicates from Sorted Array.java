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
       Arrays.sort(arr);   
       
       int k = 1; 
       for(int i = 1; i < arr.length; i++){
           if(arr[i] != arr[i-1]){
               arr[k] = arr[i];
               k++;
           }
       }
       
      
       for(int i = 0; i < k; i++){
           System.out.print(arr[i] + " ");
       }

		
		
	}
}