//simply  write a==b in condition
import java.util.Arrays ; 
public class Main
{
	public static void main(String[] args) {
		int []a={23,45,67,34};
		int []b= {23,45,67,34,45};
		boolean result= Arrays.equals(a,b);
		if (result==true){
		    System.out.println("the arrays are equal");
		}else {
		    System.out.println("the arrays are not equal");
		}
	}
	
}
