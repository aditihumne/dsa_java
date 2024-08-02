
import java.util.Arrays ; 
public class Main
{
	public static void main(String[] args) {
		int []a={23,45,67,34,56,40,67};
           System.out.println(min(a));
	       
	}
	public static int min(int[]a ){
	    int min =a[0];
	    for(int i =1 ; i<a.length ; i++){
	        if(a[i]<min){
	            min=a[i];
	        }
	    }
	    return min;
	}
	
}