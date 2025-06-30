/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("enter the sentence");
	 String word = sc.nextLine();
	char[] word1=word.toCharArray();
	 if( word1.length>0 && word1[0]!=' '){
	     System.out.println(word1[0]);
	 }
	 for(int i=0 ; i<word1.length-1 ;i++){
	     if(word1[i]==' '&& word1[i+1]!=' '){
	         System.out.println(word1[i+1]);
	     }
	 }
	}
}