/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	String str ="101010111";
	boolean binary =true;
	char[] arr = str.toCharArray();
	for(int i=0;i<arr.length;i++){
	    if(arr[i]!='0' && arr[i]!='1'){
	        binary =false;
	        break;
	    }
	}
	if(binary){
	    System.out.println("true");
	}else{
	    System.out.println("false");
	}

	    
	}
}