/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
		int n =5;
		 
		for(int i = 1;i<=n;i++){
		    int ch =65;
		    for(int j = i;j<=n;j++){
		        System.out.print((char)(ch-1+j)+" ");
		        
		    }
		    
		    System.out.println("\n");
		}
	}
}