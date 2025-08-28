/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	   String word ="programming";
	    char[] word2 = word.toCharArray();
	   HashMap<Character,Integer>program = new HashMap<>();
	  for(int i=0;i<word2.length;i++){
	      char ch = word2[i];
	      if(program.containsKey(ch)){
	          program.put(ch,program.get(ch)+1);
	      }else{
	          program.put(ch,1);
	      }
	  }
	   for (Map.Entry<Character, Integer> entry : program.entrySet()) {
    System.out.println(entry.getKey() + " → " + entry.getValue() + " times");
}


	    
	}
}