
import java.util.Arrays ; 
public class Main
{
	public static void main(String[] args) {
		int []a={23,45,67,34,56,40,67};
           evenodd(a);
	
	}
	public static void evenodd(int[]a){
	     System.out.println("the even numbers are:");
	    for(int i=0 ; i<a.length ; i++){
	       if(a[i]%2==0){
	           System.out.println(a[i]);
	       }
	        
	    }
	   System.out.println("the odd numbers are:");
	    for(int i=0 ; i<a.length ; i++){
	       if(a[i]%2 !=0){
	           System.out.println(a[i]);
	       }
	        
	    } 
	    
	}
	
}