/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	   ArrayList<String> names = new ArrayList<>();
	   names.add("aditi");
	   names.add("saurabh");
	   names.add("advait");
	   names.add("sejal");
	   names.add("aarush");
	   if(names.contains("saurabh")){
	       System.out.println("contain name");
	   }else{
	       System.out.println("does not contain name");
	   }

	   
	}
}