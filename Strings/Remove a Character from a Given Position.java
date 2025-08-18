/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		String str1 = "geeksforgeeks";
		char[] str2 = str1.toCharArray();
		char[] newstring = new char[str2.length-1];
		int pos=5;
		for(int i=0;i<pos;i++){
		    newstring[i]=str2[i];
		}
		for(int i=pos;i<newstring.length;i++){
		    newstring[i]=str2[i+1];
		}
		System.out.println((newstring));
	}
}