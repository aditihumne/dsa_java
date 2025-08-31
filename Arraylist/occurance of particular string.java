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
	   names.add("aditi");
	   names.add("aditi");
	   names.add("aarush");
	   int count=0;
	   String search ="aditi";
	   for(int i =0;i<names.size();i++){
	       if(names.get(i)==search){
	           count++;
	       }
	       
	   }
	   System.out.println(search+"="+count);
	}
}