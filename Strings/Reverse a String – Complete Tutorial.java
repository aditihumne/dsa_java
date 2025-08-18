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
	char[] str2 = str.toCharArray();
	int start =0;
	int end =str2.length-1;
	while(start<end){
	    char temp=str2[start];
	    str2[start]=str2[end];
	    str2[end]=temp;
	    start++;
	    end--;
	}
	System.out.println(str2);

	    
	}
}