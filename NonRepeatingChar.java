import java.util.*;  
class NonRepeatingChar  
{  
    public static void main(String args[])  
    {  
        Scanner sc = new Scanner(System.in);  
        System.out.println("Enter a String:");  
        String word = sc.nextLine();  
        boolean flag = true;  
  
        for(char i :word.toCharArray())  
        {  
            if (word.indexOf(i) == word.lastIndexOf(i))  
            {  
                System.out.println("The first character which is not repeating is: "+ i);  
                flag = false;  
                break;  
            }  
        }  
        if(flag== true)
        {  
            System.out.println("There is no non-repeating character in the input string");  
        }  
    }  
}