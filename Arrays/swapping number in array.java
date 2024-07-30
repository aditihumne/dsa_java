/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Arrays ;
public class Main
{
	public static void main(String[] args) {
		int []arr ={12,34,56,98,67,13};
		System.out.println(Arrays.toString(arr));
		swap(arr , 1,4);
		System.out.println(Arrays.toString(arr));
		
	}
	static void swap(int[]arr,int index1,int index2){
	    int temp =arr[index1];
	    arr[index1]=arr[index2];
	    arr[index2]=temp;
	}
}