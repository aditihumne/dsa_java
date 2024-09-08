/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
public class Main {
    public static void main(String[] args) {
        String str = "abba";
        str = str.toLowerCase(); // Convert to lowercase to make it case-insensitive
        
        // Check if the string is a palindrome
        if (ispalindrome(str)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
    
    // Method to check if a string is a palindrome
    public static boolean ispalindrome(String str) {
        int i = 0; 
        int j = str.length() - 1;
        
        // Loop to compare characters from start and end
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false; // If mismatch, it's not a palindrome
            }
            i++;
            j--;
        }
        
        return true; // If no mismatches, it's a palindrome
    }
}
