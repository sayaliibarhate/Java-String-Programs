import java.util.*;
public class AnagramString 
{  
    public static void main (String [] args) 
    {  
        Scanner sc = new Scanner(System.in); 
        
        System.out.println("Enter first string: ");
        String str1 = sc.nextLine();
        System.out.println("Enter second string: ");
        String str2 = sc.nextLine();

        str1 = str1.toLowerCase();  
        str2 = str2.toLowerCase();  
 
        if (str1.length() != str2.length()) 
        {  
            System.out.println("Both the strings are not anagram");  
        }  
        else 
        {  
            //Converting both the arrays to character array  
            char[] string1 = str1.toCharArray();  
            char[] string2 = str2.toCharArray();  
  
            //Sorting the arrays using in-built function sort ()  
            Arrays.sort(string1);  
            Arrays.sort(string2);  
  
            //Comparing both the arrays using in-built function equals ()  
            if(Arrays.equals(string1, string2) == true) 
            {  
                System.out.println("Both the strings are anagram");  
            }  
            else 
            {  
                System.out.println("Both the strings are not anagram");  
            }  
        }  
    }  
} 