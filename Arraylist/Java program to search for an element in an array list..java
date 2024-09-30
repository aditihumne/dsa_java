/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.ArrayList;
import java.util.List ; 
public class Main
{
	public static void main(String[] args) {
	    List<String> addition = new ArrayList<>();
	    addition.add("orange");
	    addition.add("black");
	    addition.add("green");
	    addition.add("white");
	    addition.add("black");
	    
	   if(addition.contains("green")){
	            System.out.println("the element is found");
	        }else{
	             System.out.println("the element is not found");
	        }
	        
	}
}