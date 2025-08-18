/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		String str = "geeksforgeeks";
		char [] str2 = str.toCharArray();
		char [] str3 = new char[str2.length];
		char word ='e';
		for(int i=0;i<str2.length;i++){
		    if(str2[i]!=word){
		        str3[i]=str2[i];
		    }
		}
		System.out.println(str3);
	}
}