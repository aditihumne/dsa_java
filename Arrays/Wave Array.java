/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int []arr ={5,3,6,8,10,2,9};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		for(int i =0;i<arr.length-1;i+=2){
		    if(i%2==0){
		        int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
		    }
		    
		}
		System.out.println(Arrays.toString(arr));
	}
}