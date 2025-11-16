import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileAnalyzer {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter full file path: ");
        String filePath = scanner.nextLine();
        scanner.close();

        int wordCount = 0;
        int lineCount = 0;
        int charCount = 0;
        int digitCount = 0;
        int letterCount = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;

            while ((line = reader.readLine()) != null) {
                lineCount++;
                charCount += line.length();

                String[] words = line.split("\\s+");
                for (String word : words) {
                    if (!word.isEmpty()) {
                        wordCount++;
                    }
                }

                for (char ch : line.toCharArray()) {
                    if (Character.isLetter(ch)) {
                        letterCount++;
                    }

                    if (Character.isDigit(ch)) {
                        digitCount++;
                    }
                }

                countDigitsWithTryCatch(line);
            }

            System.out.println("line counter: " + lineCount);
            System.out.println("word counter: " + wordCount);
            System.out.println("char counter: " + charCount);
            System.out.println("letter (no digits or symbols) " + letterCount);
            System.out.println("digit counter " + digitCount);

        } catch (IOException e) {
            System.err.println("\nIO error, check the file path is right");
            System.err.println(e.getMessage());
        }
    }

    private static void countDigitsWithTryCatch(String line) {
        int tryCatchDigitCount = 0;
        for (char ch : line.toCharArray()) {
            try {
                Integer.parseInt(String.valueOf(ch));
                tryCatchDigitCount++;
            } catch (NumberFormatException e) {
            }
        }
    }
}