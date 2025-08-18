/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main {
    public static void main(String[] args) {
        int []arr={0,0,1,0,1,1,1,1,0,0,1};
        int maxcount=1 , currentcount=1;
        for(int i = 1 ; i<arr.length ;i++){
            if(arr[i]==arr[i-1]){
                currentcount++;
            }else {
                maxcount=Math.max(maxcount,currentcount);
                currentcount=1;
            }
        }
        maxcount=Math.max(maxcount,currentcount);
        System.out.println(maxcount);
    }
}
