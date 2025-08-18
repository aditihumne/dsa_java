/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	String str ="hello";
	for(int i=0;i<str.length();i++){
	    for(int j =i+1;j<str.length();j++){
	        String sub = str.substring(i,j);
	        System.out.println(sub);
	    }
	}

	    
	}
}