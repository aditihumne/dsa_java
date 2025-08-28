/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	String str = "i love love java";
	String[] word = str.split(" ");
	HashMap<String,Integer> go = new HashMap<>();
	for(int i =0;i<word.length;i++){
	    String ch = word[i];
	    if(go.containsKey(ch)){
	        go.put(ch,go.get(ch)+1);
	        
	    }else {
	        go.put(ch,1);
	    }
	}
	for(Map.Entry<String,Integer>entry : go.entrySet()){
	    System.out.println(entry.getKey()+"->"+entry.getValue());
	}
	}
}