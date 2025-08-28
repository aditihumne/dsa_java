/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    String str ="listen";
	    String str1 ="silent";
	    char[] word1 = str.toCharArray();
	    char[] word2 = str1.toCharArray();
	    if(word1.length != word2.length){
	        System.out.println("it is not anagram");
	        return;
	    }
	    Arrays.sort(word1);
	    Arrays.sort(word2);
	    if(Arrays.equals(word1,word2)){
	        System.out.println("it is a anagram");
	    }else{
	        System.out.println("it is not anagram");
	    }
	
	}
}