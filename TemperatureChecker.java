import java.util.Scanner;

public class TemperatureChecker {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user for temperature input
        System.out.print("Enter the temperature in Celsius: ");
        
        // Read the temperature from the user
        int temperature = scanner.nextInt();
        
        // Check the temperature range using if-else branching
        if (temperature <= 10) {
            System.out.println("The temperature is Cold.");
        } else if (temperature <= 25) {
            System.out.println("The temperature is Warm.");
        } else {
            System.out.println("The temperature is Hot.");
        }
        
        // Close the scanner
        scanner.close();
    }
}
