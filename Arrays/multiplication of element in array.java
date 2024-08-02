
import java.util.Arrays ; 
public class Main
{
	public static void main(String[] args) {
		int []a={23,45,67,34,56,40,67};
	multiplication(a);
	
	}
	public static void multiplication(int[]a){
	    int n=1;
	    for(int i=0 ; i<a.length ; i++){
	        n = n*a[i];
	        
	    }
	    System.out.println(n);
	}
	
}