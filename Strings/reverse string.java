/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
public class Main {
    public static void main(String[] args) {
        String str = "aditi ";
        str = str.toLowerCase(); // Convert to lowercase to make it case-insensitive
        
       reverse(str);
    }
    
    // Method to check if a string is a palindrome
    public static void reverse(String str) {
       
        char [] chararray = str.toCharArray();
        int i = 0; 
        int j = str.length() - 1;
    
        while (i < j) {
            char temp = chararray[i] ; 
           chararray[i]  = chararray[j];
            chararray[j] =temp;
            i++;
            j--;
        }
        String reversedStr = new String(chararray);
        System.out.println("Reversed String: " + reversedStr);
    }
}
