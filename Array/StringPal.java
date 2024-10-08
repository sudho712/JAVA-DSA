package Array;
import java.util.Scanner;

public class StringPal 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter the text to check for palindrome: ");
        String str = sc.nextLine();  // Read the entire line

        boolean ispal = true;  // Declare boolean as true
        int n = str.length();  // Get the length of the string

        // Check for palindrome
        for (int i = 0; i < n / 2; i++)
        {
            if (str.charAt(i) != str.charAt(n - 1 - i))  // Compare characters
            {
                ispal = false;  // Set ispal to false if mismatch found
                break;  // Exit the loop early if a mismatch is found
            }
        }

        // Output the result
        if (ispal)
        {
            System.out.println("The string is a palindrome.");
        }
        else
        {
            System.out.println("The string is not a palindrome.");
        }

        sc.close();  // Close the scanner
    }
}
