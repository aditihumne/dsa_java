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
	   HashMap<Character,Integer> go = new HashMap<>();
	   for (int i =0;i<word1.length;i++){
	       char ch =word1[i];
	       if(go.containsKey(ch)){
	           go.put(ch,go.get(ch)+1);
	       }else{
	           go.put(ch,1);
	       }
	   }
	    for (int i =0;i<word2.length;i++){
	       char ch =word1[i];
	       if(go.containsKey(ch)){
	           go.put(ch,go.get(ch)-1);
	       }if(go.get(ch)==0){
	           go.remove(ch);
	       }else {
                System.out.println("Not Anagram");
                return;
            }
	   }if(go.isEmpty()){
	        System.out.println(" Anagram");
	   }else{
	       System.out.println("Not Anagram");
	   }
	
	}
}