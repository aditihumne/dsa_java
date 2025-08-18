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
		char[] newstring = new char[str2.length+1];
		int pos=5;
		char word ='a';
		for(int i=0;i<pos;i++){
		    newstring[i]=str2[i];
		}
		newstring[pos]=word;
		for(int i=pos;i<str2.length;i++){
		    newstring[i+1]=str2[i];
		}
		System.out.println((newstring));
	}
}