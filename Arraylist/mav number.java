/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	   ArrayList<Integer> number = new ArrayList<>();
	   number.add(20);
	   number.add(30);
	   number.add(40);
	   number.add(50);
	   int max=number.get(0);
	   for(int i=0 ; i<number.size();i++){
	       if(number.get(i)<max){
	           max=number.get(i);
	           
	       }
	      
	   }
	 System.out.println(max);
	}
}