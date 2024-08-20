/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
	    int [] arr = {1,4,6,7,10,12,11,5};
	    int n = arr.length;
	    int result = Oddinteger(arr , n);
	    System.out.println(result);
	
	}
	public static int Oddinteger(int []arr ,int n){
	    int sum =0 ; 
	  
	    for(int i = 0; i<n ; i++){
	        if(arr[i]%2!=0){
	            sum+=arr[i];
	            
	        }
	        
	    }
	    return sum ; 
	}
}