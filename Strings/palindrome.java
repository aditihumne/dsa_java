/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
public class Main {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
	 System.out.println("enter the text");
	 String word = sc.nextLine();
	 char[] word1 = word.toCharArray();
	int start = 0;
	int end = word1.length-1;
        while(start<end){
           
            if(word1[start] != word1[end]){
                System.out.println("not palindrom");
               return ; 
            }
           
           start++;
           end --;
        }
       System.out.println(" palindrom"); 
    }
}
