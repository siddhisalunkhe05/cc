import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter the first number
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        
        // Prompt the user to enter the second number
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        
        // Close the scanner to prevent resource leak
        scanner.close();
        
        // Calculate the sum
        double sum = num1 + num2;
        
        // Print the result
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
    }
}

