/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
	    String str ="i am aditi";
	    
	    String[]words = str.split("\\s+");
	     for (int i = 0 ; i<words.length ; i++) {
            if (words[i].length() % 2 == 0) {
                System.out.println(words[i]);
            }
        }
	    
	
	}
}
////////////////////////////////////////////
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("enter the string:");
	    String str = sc.nextLine();
	    
	    String[]words = str.split("\\s+");
	     for (int i = 0 ; i<words.length ; i++) {
            if (words[i].length() % 2 == 0) {
                System.out.println(words[i]);
            }
        }
	    
	
	}
}