import java.util.Scanner;

class avg10{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        
        int[] n= new int[10];
        int sum = 0;
        int avg=0;

        // Input numbers and calculate the sum
        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++) {
            n[i] = sc.nextInt();
            sum =sum+ n[i];
            avg=sum/10;
        }

        // Display the sum
        System.out.println("Sum of the numbers: " + sum);
        System.out.println("Sum of the numbers: " + avg);

        
        sc.close();
    }
}
