import java.util.*;

public class RemoveDuplicates 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str1 = sc.nextLine();
        
        System.out.println("The given string is: " + str1);
        
        System.out.println("After removing duplicates characters the new string is: " + removeDuplicateChars(str1));
    }
    private static String removeDuplicateChars(String sourceStr) {
        // Convert the input string to a character array.
        char[] arr1 = sourceStr.toCharArray();
        
        // Initialize an empty string to store the resulting string without duplicates.
        String targetStr = "";
        
        // Loop through each character in the character array.
        for (char value: arr1) 
        {
            // Check if the character doesn't exist in the targetStr.
            if (targetStr.indexOf(value) == -1) 
            {
                // If the character doesn't exist, add it to the targetStr.
                targetStr += value;
            }
        }
        // Return the resulting string without duplicates.
        return targetStr;
    }
}