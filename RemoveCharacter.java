import java.util.Scanner;

public class RemoveCharacter 
{

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = scanner.nextLine();

        // Get the character to be removed from the user
        System.out.println("Enter the character to be removed: ");
        char ch = scanner.next().charAt(0);

        // Remove the character from the string
        String newStr = str.replace(ch, '');
        System.out.println("The new string is: " + newStr);
    }
}