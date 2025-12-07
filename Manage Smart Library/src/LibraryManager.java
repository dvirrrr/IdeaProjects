import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class LibraryManager {

    private static final int MAX_ITEMS = 100;
    private LibraryItem[] items;
    private int itemCount;

    public LibraryManager() {
        this.items = new LibraryItem[MAX_ITEMS];
        this.itemCount = 0;
    }

    public Optional<LibraryItem> findItemById(String id) {
        //
        for (int i = 0; i < itemCount; i++) {
            if (items[i].getId().equals(id)) {
                return Optional.of(items[i]);
            }
        }
        return Optional.empty();
    }

    public void addItem(LibraryItem item) throws DuplicateItemException {
        //
        if (itemCount >= MAX_ITEMS) {
            System.err.println("Error: Library is full. Cannot add item.");
            return;
        }

        if (findItemById(item.getId()).isPresent()) {
            throw new DuplicateItemException("Error: Item with ID " + item.getId() + " already exists.");
        }

        items[itemCount] = item; //
        itemCount++; //
        System.out.println("Successfully added: " + item.getTitle());
    }

    public void removeItem(String id) throws ItemNotFoundException {
        int foundIndex = -1;
        LibraryItem itemToRemove = null;


        for (int i = 0; i < itemCount; i++) {
            if (items[i].getId().equals(id)) {
                foundIndex = i;
                itemToRemove = items[i];
                break;
            }
        }


        if (foundIndex == -1) {
            throw new ItemNotFoundException("Error: Item with ID " + id + " not found.");
        }

        for (int i = foundIndex; i < itemCount - 1; i++) {
            items[i] = items[i + 1];
        }


        items[itemCount - 1] = null; //
        itemCount--; //

        System.out.println("Successfully removed: " + itemToRemove.getTitle());
    }

    public List<LibraryItem> searchItems(String keyword) {
        List<LibraryItem> results = new ArrayList<>(); //
        for (int i = 0; i < itemCount; i++) { //
            LibraryItem item = items[i];
            if (item instanceof ISearchable) {
                if (((ISearchable) item).matches(keyword)) {
                    results.add(item);
                }
            }
        }
        return results;
    }


    public void printAllItems() {
        if (itemCount == 0) { //
            System.out.println("The library is currently empty.");
            return;
        }
        for (int i = 0; i < itemCount; i++) { //
            items[i].printDetails();
            System.out.println("--------------------");
        }
    }


    public void saveToFile(String fileName) throws IOException {
        //
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (int i = 0; i < itemCount; i++) { //
                writer.write(items[i].toFileString());
                writer.newLine();
            }
            System.out.println("Successfully saved library to " + fileName);
        }
    }


    public void loadFromFile(String fileName) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            //
            this.items = new LibraryItem[MAX_ITEMS]; //
            this.itemCount = 0; //

            while ((line = reader.readLine()) != null) {
                if (itemCount >= MAX_ITEMS) {
                    System.err.println("Library is full. Stopping load operation.");
                    break;
                }
                try {
                    LibraryItem item = parseItemFromCsvLine(line);
                    if (item != null) {
                        //
                        addItem(item);
                    }
                } catch (DuplicateItemException e) {
                    System.err.println("Skipping duplicate item from file: " + line);
                } catch (Exception e) {
                    System.err.println("Skipping malformed line: " + line + " (" + e.getMessage() + ")");
                }
            }
            System.out.println("Successfully loaded library from " + fileName);
        }
    }


    private LibraryItem parseItemFromCsvLine(String line) {
        String[] parts = line.split(",");
        if (parts.length < 5) return null;

        String type = parts[0];
        String id = parts[1];
        String title = parts[2];
        String author = parts[3];
        int year = Integer.parseInt(parts[4]);

        switch (type) {
            case "Book":
                if (parts.length < 6) return null;
                String genre = parts[5];
                return new Book(id, title, author, year, genre);
            case "Magazine":
                if (parts.length < 6) return null;
                int issueNumber = Integer.parseInt(parts[5]);
                return new Magazine(id, title, author, year, issueNumber);
            case "EBook":
                if (parts.length < 6) return null;
                double fileSize = Double.parseDouble(parts[5]);
                return new EBook(id, title, author, year, fileSize);
            default:
                System.err.println("Unknown item type in file: " + type);
                return null;
        }
    }

    public void sortItemsByYear() {
        //
        Arrays.sort(items, 0, itemCount, Comparator.comparingInt(LibraryItem::getYear));
        System.out.println("Items sorted by year.");
        printAllItems();
    }


    public void sortItemsByAuthor() {
        //
        Arrays.sort(items, 0, itemCount, Comparator.comparing(LibraryItem::getAuthor));
        System.out.println("Items sorted by author.");
        printAllItems();
    }
}