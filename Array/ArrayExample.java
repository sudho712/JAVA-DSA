import java.util.Scanner;

class ArrayExample {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        
        int[] numbers = new int[10];
        int sum = 0;

        // Input numbers and calculate the sum
        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++) {
            numbers[i] = sc.nextInt();
            sum += numbers[i];
        }

        // Display the sum
        System.out.println("Sum of the numbers: " + sum);

        
        sc.close();
    }
}
