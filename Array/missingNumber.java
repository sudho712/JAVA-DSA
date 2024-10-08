package Array;
import java.util.Scanner;

public class missingNumber 
{
    public static void main( String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array element:");
        int n = sc.nextInt();

        int[] arr = new int[n - 1];
        System.out.println("Enter the elements of the array:");
        for(int i = 0; i < n - 1; i++)
        {
            arr[i] = sc.nextInt();
        }

        int totalSum = n * (n + 1) / 2;  // Sum of the first 'n' natural numbers
        int actualSum = 0;
        for(int i = 0; i < n - 1; i++)
        {
            actualSum += arr[i];
        }

        int missingNumber = totalSum - actualSum;
        System.out.println("The missing number is: " + missingNumber);
        
        sc.close();  // Closing scanner properly here
    }
}
