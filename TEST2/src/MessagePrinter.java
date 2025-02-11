import java.util.Scanner;

public class MessagePrinter {
    // Method to print the message
    public void printMessage(String name) {
        System.out.println("hello " + name);
    }

    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Create an instance of MessagePrinter
        MessagePrinter printer = new MessagePrinter();

        // Call the printMessage method with the user's input
        printer.printMessage(name);

        // Close the scanner
        scanner.close();
    }
}
