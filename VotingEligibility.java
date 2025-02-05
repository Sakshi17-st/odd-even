import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {
        // Create a Scanner object to read input2
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user for their age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
    

        // Prompt the user for their citizenship status (true/false)'
        
        System.out.print("Are you a citizen? (true/false): ");
        boolean isCitizen = scanner.nextBoolean();
        
        // Check voting eligibility using logical operators
        
        if (age >= 18 && isCitizen) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote.");
        }
        
        // Close the scanner
        scanner.close();
    }
}
