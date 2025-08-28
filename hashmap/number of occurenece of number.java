/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	int[] arr ={2,3,2,4,5,2,4,5,1,4,5};
	HashMap<Integer,Integer> digit= new HashMap<>();
	for(int i=0;i<arr.length;i++){
	    int num = arr[i];
	    if(digit.containsKey(num)){
	        digit.put(num,digit.get(num)+1);
	        
	    }else{
	        digit.put(num,1);
	    }
	}
	for(Map.Entry<Integer,Integer>entry : digit.entrySet()){
	    System.out.println(entry.getKey()+"->"+entry.getValue());
	}
	}
}