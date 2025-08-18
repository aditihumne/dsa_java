/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main {
    public static void main(String[] args) {
        int []arr ={23,0,9,6,0,12,56,0,31};
        int k=3;
        int n=arr.length;
        for(int i =0;i<n ;i+=3){
            int left = i ;
            int right =Math.min(i+k-1,n-1);
            
            while(left<right){
            int temp = arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
        
            
        }
        System.out.println(Arrays.toString(arr));
    }
}
