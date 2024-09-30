/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.ArrayList;
import java.util.List ; 
import java.util.*; 
public class Main
{
	public static void main(String[] args) {
	    List<String> addition = new ArrayList<>();
	    addition.add("orange");
	    addition.add("pink");
	    addition.add("green");
	    addition.add("white");
	    addition.add("black");
	    
	   System.out.println(addition);
	   Collections.shuffle(addition);
	   System.out.println(addition);
	        
	}
}