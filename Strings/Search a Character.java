/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
      String str = "geeksforgeeks";
        char word = 'K';
        char[] str2 = str.toCharArray();
        int count=0;

        for (int i = 0; i < str2.length; i++) {
            if (str2[i] == word) {
                System.out.println(i);
                count++;
               
            }
            
            
        }

        if(count==0){
            System.out.println("no found");
        }
       
	}
}