/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		HashMap<String,Integer> go = new HashMap<>();
		go.put("saurabh",50);
		go.put("aditi",40);
		go.put("sejal",20);
		System.out.println(go.get("sejal"));
		System.out.println("is sejal present "+go.containsKey("sejal"));
		System.out.println("is sejal present "+go.containsValue(20));
		go.replace("athulya",10);
		go.remove("sejal");
		System.out.println(go);
		for(Map.Entry<String,Integer>entry :go.entrySet()){
		    System.out.println(entry.getKey()+"->"+entry.getValue());
		}
	}
}