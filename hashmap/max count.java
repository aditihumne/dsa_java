/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	  int[]arr = {1,2,2,1,1,1,1,5,4,3};
	  HashMap<Integer,Integer> go = new HashMap<>();
	  for(int i=0;i<arr.length;i++){
	      int num=arr[i];
	      if(go.containsKey(num)){
	          go.put(num,go.get(num)+1);
	          
	      }else{
	          go.put(num,1);
	      }
	  }
	  int maxcount=0;
	  int current =-1;
	  for(Map.Entry<Integer,Integer>entry :go.entrySet()){
	      if(entry.getValue()>maxcount){
	          maxcount=entry.getValue();
	          current = entry.getKey();
	      }
	  }
	System.out.println(current+"->"+maxcount);
	}
}