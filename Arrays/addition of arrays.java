/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Arrays;
public class Main
{
	public static void main(String[] args) {
		
		int[]arr = {23,45,56,21,22,67,21};
	    System.out.println(Arrays.toString(arr));
		System.out.println(addition(arr));
		
	}
	public static int addition(int[] arr){
	    int sum = 0;
	    for(int i=0 ; i<arr.length ; i++){
	       sum = sum + arr[i];
	    }
	    return sum;
	}
}