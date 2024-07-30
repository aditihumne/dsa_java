/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
	    int[]arr= {23,45,12,34,45,78,23,54};
	    System.out.println(max(arr));
		
	}
	static int max(int[]arr) {
	    int maxval=arr[0];
	    for(int i=1;i<arr.length;i++){
	       if(arr[i]>maxval){
	        maxval=arr[i];
	       }
	       
	    }
	    return maxval;
	}
}