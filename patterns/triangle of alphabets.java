/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
		int n =5;
		 char ch = 'A';
		for(int i = 1;i<=n;i++){
		    for(int j = 1;j<=i;j++){
		        System.out.print(ch+" ");
		        ch++;
		    }
		    System.out.println();
		}

	/* 		int n =5;
		 int ch =65;
		for(int i = 0;i<=n-1;i++){
		   
		    for(int j = 0;j<=i;j++){
		 
		        System.out.print((char)(ch)+" ");
		        ch++;
		        
		        
		    }
		    
		    System.out.println("\n");
		}*/
	}
}