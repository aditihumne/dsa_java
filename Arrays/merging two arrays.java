/*System.arraycopy(arr1,0,arr3,0,a);

arr1 is the source array.
0 is the starting position in the source array b from which elements will be copied.
arr3 is the destination array.
0 is the starting position in the destination array c where the copied elements will be placed. This is right after the last copied element from array a.
a is the number of elements to be copied from the source array b*/
import java.util.Arrays ;
public class Main
{
	public static void main(String[] args) {
	    int[] arr1 = {1,23,54,56,25,67};
	    int a = arr1.length;
	    
	    int[] arr2 = {12,34,45,78};
	    int b= arr2.length;
	    
	    int c = a+b ;
	    int []arr3= new int[c];
	    System.arraycopy(arr1,0,arr3,0,a);
	    System.arraycopy(arr2,0,arr3,a,b);
	    System.out.println(Arrays.toString(arr3));
	    
	    //note you can merge array directly in as arr[]3=arr2+aarr2;
	    // the + operator cannot be used to concatenate or merge arrays directly. The + operator is used for arithmetic addition and string concatenation, but not for combining arrays.
	    

	}
	
}