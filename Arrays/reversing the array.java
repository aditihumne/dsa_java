/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Arrays;
public class Main
{
	public static void main(String[] args) {
	 int []arr= {12,34,5,23,89,16,37};
	 System.out.println(Arrays.toString(arr));
	 reverse(arr);
	  System.out.println(Arrays.toString(arr));
	}
	static void reverse(int[]arr){
	    int start =0;
	    int end=arr.length -1;
	    while(start<end){
	        swap(arr,start,end);
	        start++;
	        end--;
	    }
	    
	}
	static void swap(int[]arr,int index1,int index2){
	    int temp =arr[index1];
	    arr[index1]=arr[index2];
	    arr[index2]=temp;
	}
}