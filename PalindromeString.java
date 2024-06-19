import java.util.*;

class PalindromeString 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to be reversed: ");
        String str = sc.nextLine();
        String rev = "";
        int leng = str.length();
        for(int i=leng-1 ; i>=0 ; i--)
        {
            rev = rev + str.charAt(i); 
        }
        
        if(str.equals(rev))
        {
            System.out.println("\nThe given string is palindrome!");
        }
        else
        {
            System.out.println("\nThe given string is not palindrome!");
        }
    }
}