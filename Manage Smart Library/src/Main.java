import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 * Main class for the Smart Library Management system.
 * Provides a text-based user interface (TUI). 
 */
public class Main {
    private static final LibraryManager manager = new LibraryManager();
    private static final Scanner scanner = new Scanner(System.in);
    private static final String DEFAULT_FILENAME = "library_data.csv";

    public static void main(String[] args) {
        System.out.println("Welcome to the Manage Smart Library System!");

        boolean running = true;
        while (running) {
            showMenu();
            int choice = getIntInput("Enter your choice: ");

            switch (choice) {
                case 1:
                    handleAddItem();
                    break;
                case 2:
                    handleRemoveItem();
                    break;
                case 3:
                    handleSearchItem();
                    break;
                case 4:
                    manager.printAllItems();
                    break;
                case 5:
                    handleSortItems();
                    break;
                case 6:
                    handleSaveToFile();
                    break;
                case 7:
                    handleLoadFromFile();
                    break;
                case 0:
                    running = false;
                    System.out.println("Thank you for using the system. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
            System.out.println(); // New line for readability
        }
        scanner.close();
    }

    private static void showMenu() {
        System.out.println("--- Library Menu ---");
        System.out.println("1. Add New Item");
        System.out.println("2. Remove Item by ID");
        System.out.println("3. Search for Item");
        System.out.println("4. Display All Items");
        System.out.println("5. Sort Items");
        System.out.println("6. Save Library to File");
        System.out.println("7. Load Library from File");
        System.out.println("0. Exit");
        System.out.println("--------------------");
    }

    private static void handleAddItem() {
        System.out.println("Select item type to add:");
        System.out.println("1. Book");
        System.out.println("2. Magazine");
        System.out.println("3. EBook");
        int typeChoice = getIntInput("Your choice: ");

        try {
            String id = getStringInput("Enter ID: ");
            // Check for duplicate ID immediately
            if (manager.findItemById(id).isPresent()) {
                throw new DuplicateItemException("ID " + id + " already exists.");
            }
            String title = getStringInput("Enter Title: ");
            String author = getStringInput("Enter Author: ");
            int year = getIntInput("Enter Year: ");

            LibraryItem item = null;
            switch (typeChoice) {
                case 1:
                    String genre = getStringInput("Enter Genre: ");
                    item = new Book(id, title, author, year, genre);
                    break;
                case 2:
                    int issue = getIntInput("Enter Issue Number: ");
                    item = new Magazine(id, title, author, year, issue);
                    break;
                case 3:
                    double size = getDoubleInput("Enter File Size (MB): ");
                    item = new EBook(id, title, author, year, size);
                    break;
                default:
                    System.out.println("Invalid type choice.");
                    return;
            }
            manager.addItem(item);

        } catch (DuplicateItemException e) { // 
            System.err.println(e.getMessage());
        } catch (Exception e) {
            System.err.println("Error adding item: " + e.getMessage());
        }
    }

    private static void handleRemoveItem() {
        try {
            String id = getStringInput("Enter ID of item to remove: ");
            manager.removeItem(id);
        } catch (ItemNotFoundException e) { // 
            System.err.println(e.getMessage());
        }
    }

    private static void handleSearchItem() {
        String keyword = getStringInput("Enter search keyword (title, author, ID, etc.): ");
        List<LibraryItem> results = manager.searchItems(keyword);

        if (results.isEmpty()) {
            System.out.println("No items found matching '" + keyword + "'.");
        } else {
            System.out.println("--- Search Results ---");
            for (LibraryItem item : results) {
                item.printDetails();
                System.out.println("--------------------");
            }
        }
    }

    private static void handleSortItems() {
        System.out.println("Sort by:");
        System.out.println("1. Year");
        System.out.println("2. Author");
        int choice = getIntInput("Your choice: ");

        switch (choice) {
            case 1:
                manager.sortItemsByYear();
                break;
            case 2:
                manager.sortItemsByAuthor();
                break;
            default:
                System.out.println("Invalid sort choice.");
        }
    }

    private static void handleSaveToFile() {
        try {
            manager.saveToFile(DEFAULT_FILENAME);
        } catch (IOException e) { // [cite: 28]
            System.err.println("Error saving to file: " + e.getMessage());
        }
    }

    private static void handleLoadFromFile() {
        try {
            manager.loadFromFile(DEFAULT_FILENAME);
        } catch (FileNotFoundException e) { // [cite: 28]
            System.err.println("Error: File not found (" + DEFAULT_FILENAME + ")");
        } catch (IOException e) { // [cite: 28]
            System.err.println("Error loading from file: " + e.getMessage());
        }
    }

    // --- Input Helper Methods ---

    private static String getStringInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }

    private static int getIntInput(String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                int value = scanner.nextInt();
                scanner.nextLine(); // Consume newline
                return value;
            } catch (InputMismatchException e) {
                System.err.println("Invalid input. Please enter a number.");
                scanner.nextLine(); // Clear buffer
            }
        }
    }

    private static double getDoubleInput(String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                double value = scanner.nextDouble();
                scanner.nextLine(); // Consume newline
                return value;
            } catch (InputMismatchException e) {
                System.err.println("Invalid input. Please enter a decimal number (e.g., 5.2).");
                scanner.nextLine(); // Clear buffer
            }
        }
    }
}