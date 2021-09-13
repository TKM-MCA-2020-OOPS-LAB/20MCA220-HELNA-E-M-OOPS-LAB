// Java Program to write into a File
// using BufferedWriter Class
 
// Importing java input output libraries
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
 
// Class
public class GFG {
 
    // Main driver method
    public static void main(String[] args)
    {
 
        // Assign the file content
        // Custom contents taken as input to illustrate
        String text
            = "WELCOME TO OOPS LAB";
 
        // Try block to check if exceptions occurs
        try {
 
            // Step 1: Create an object of BufferedWriter
            BufferedWriter f_writer
                = new BufferedWriter(new FileWriter(
                    "/home/user/MyJavaDirectory/pgms/oops.txt"));
 
            // Step 2: Write text(content) to file
            f_writer.write(text);
 
            // Step 3: Printing the content inside the file
            // on the terminal/CMD
            System.out.println(text);
 
            // Step 4: Display message showcasing
            // succcessful execution of the program
            System.out.print("\nFile is created successfully with the content.");
 
            // Step 5: Close the BufferedWriter object
            f_writer.close();
        }
 
        // Catch block to handle if exceptions occcurs
        catch (IOException e) {
            // Print the exception
            System.out.print(e.getMessage());
        }
    }
}
