import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class FilesMerge {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String directoryPathString;
        String file1Name, file2Name, file3Name;

        System.out.print("Enter directory address");
        directoryPathString = scanner.nextLine();

        // 2. קבלת שמות הקבצים
        System.out.print("enter name of first file");
        file1Name = scanner.nextLine();

        System.out.print("enter name of second file");
        file2Name = scanner.nextLine();

        System.out.print("enter name of third file");
        file3Name = scanner.nextLine();

        scanner.close();

        Path file1Path = Paths.get(directoryPathString, file1Name);
        Path file2Path = Paths.get(directoryPathString, file2Name);
        Path file3Path = Paths.get(directoryPathString, file3Name);

        try {
            byte[] content1 = Files.readAllBytes(file1Path);
            System.out.println("\nContent " + file1Name + "read succesfully.");

            byte[] content2 = Files.readAllBytes(file2Path);
            System.out.println("\nContent " + file2Name + "read succesfully.");


            byte[] mergedContent = new byte[content1.length + content2.length];

            System.arraycopy(content1, 0, mergedContent, 0, content1.length);

            System.arraycopy(content2, 0, mergedContent, content1.length, content2.length);

            Files.write(file3Path, mergedContent, StandardOpenOption.CREATE);

            System.out.println("\nString Merge is Successful");
            System.out.println("Result is saved in " + file3Path.toAbsolutePath());

        } catch (IOException e) {
            // טיפול בשגיאות קלט/פלט (קובץ לא נמצא, הרשאה נדחתה וכו')
            System.err.println("\nError occurred while trying to access file");
            System.err.println(e.getMessage());
        } catch (Exception e) {
            // טיפול בשאר החריגים
            System.err.println("\nGeneral Accident" + e.getMessage());
        }
    }
}
