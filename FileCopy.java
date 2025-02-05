import java.io.*;

public class FileCopy {
    public static void main(String[] args) {
        // Source and destination file paths
        String sourceFilePath = "source.txt";
        String destinationFilePath = "destination.txt";

        // Using try-with-resources to handle file operations
        try (
            BufferedReader reader = new BufferedReader(new FileReader(sourceFilePath));
            BufferedWriter writer = new BufferedWriter(new FileWriter(destinationFilePath))
        ) {
            String line;
            // Read from source file line by line and write to destination file
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine(); // Ensure lines are written correctly
            }
            System.out.println("File copied successfully.");
        } catch (FileNotFoundException e) {
            System.err.println("Source file not found: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("An error occurred during file operations: " + e.getMessage());
        }
    }
}
