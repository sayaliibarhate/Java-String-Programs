import java.util.*;

class ReverseString 
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
        System.out.println("\nThe reversed string is: "+rev);
    }
}