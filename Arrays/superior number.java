/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
        int[] arr = new int[n];
        
        // Input array elements
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        
        // Rightmost element is always superior
        int count = 1;
        int max = arr[n - 1];
        
        // Traverse from right to left, starting from the second-last element
        for(int i = n - 2; i >= 0; i--){
            if(arr[i] > max){
                count++;
                max = arr[i]; // Update max
            }
        }
        
        // Print the count of superior elements
        System.out.println(count);
		
	
	
	}
}