/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main {
    public static void main(String[] args) {
        int []arr ={23,5,9,6,3,12,56,10,31};
        int k=4;
        int n =arr.length -1;
        for(int i=0;i< k;i++){
            for(int j=0;j<n;j++){
                arr[j]=arr[j+1];
                
            }
            arr[n]=arr[0];
        }
            
        
            
        
        System.out.println(Arrays.toString(arr));
    }
}
