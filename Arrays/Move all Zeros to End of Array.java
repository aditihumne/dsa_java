/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main {
    public static void main(String[] args) {
        int []arr ={23,0,9,6,0,12,56,0,31};
        int n=arr.length;
        int []temp = new int[n];
        int j =0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                temp[j++]=arr[i];
            }
        }
            while(j<n){
                temp[j++]=0;
            }
        
        for(int i =0;i<n;i++){
            arr[i]=temp[i];
        }
        System.out.println(Arrays.toString(arr));
    }
}
