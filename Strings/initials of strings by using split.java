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
	 String[] word1 = word.split(" ") ; 
	 for(int i=0 ; i< word1.length;i++){
	     if(!word1[i].isEmpty()){
	         System.out.print(word1[i].charAt(0) +" ");
	     }
	 }
	}
}