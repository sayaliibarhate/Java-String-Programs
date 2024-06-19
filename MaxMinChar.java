import java.util.*;

class MaxMinChar
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        
        int[] arr = new int[127];
        for(int i=0 ; i<str.length() ; i++)
        {
            arr[str.charAt(i)] = arr[str.charAt(i)] + 1;
            //storing frequency of letter at letter's ascii value
        }
        
        int max = -1;
        char ch1 = ' ';
        for(int i=0 ; i<str.length() ; i++)
        {
            if( max < arr[str.charAt(i)])
            {
                max = arr[str.charAt(i)];
                ch1 = str.charAt(i);
            }
        }
        
        System.out.println("The maximum occuring character is: "+ch1);
        
        int min = Integer.MAX_VALUE;
        char ch2 = ' ';
        for(int i=0 ; i<str.length() ; i++)
        {
            if( min > arr[str.charAt(i)])
            {
                min = arr[str.charAt(i)];
                ch2 = str.charAt(i);
            }
        }
        
        System.out.println("The minimum occuring character is: "+ch2);
    }
}