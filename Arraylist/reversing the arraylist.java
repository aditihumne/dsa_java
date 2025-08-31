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
	   number.add(1);
	   number.add(2);
	   number.add(3);
	   number.add(4);
	   number.add(5);
	   number.add(6);
	   number.add(7);
	   int i = 0;
	   int j = number.size()-1;
	   while(i<j){
	       int temp=number.get(i);
	       number.set(i,number.get(j));
	       number.set(j,temp);
	       i++;
	       j--;
	   }
	   
	   System.out.println(number);
	}
}