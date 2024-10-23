import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        
        // Using formula
        int sum = n * (n + 1) / 2;
        
        System.out.println("Sum of first " + n + " natural numbers is: " + sum);
    }
}
