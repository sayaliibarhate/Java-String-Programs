import java.util.*;

class CountWords
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        String strarr[] = str.split(" ");
        int count = strarr.length;
        System.out.println("\nThe number of words in the given string is: "+count);
    }
}