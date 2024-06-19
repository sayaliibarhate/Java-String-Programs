import java.util.Scanner;

public class RemoveCharFromFirst {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first string: ");
        String str1 = sc.nextLine();

        System.out.println("Enter the second string: ");
        String str2 = sc.nextLine();

        String result = "";

        for (int i = 0; i < str1.length(); i++) {
            // Check if the character is present in the second string.
            if (!str2.contains(str1.charAt(i))) {
                // Add the character to the result string.
                result += str1.charAt(i);
            }
        }
        System.out.println("The resulting string is: " + result);
    }
}