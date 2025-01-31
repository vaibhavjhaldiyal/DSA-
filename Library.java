import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class Library{


    public void showBooks(HashSet<String> set) {
        if (set.isEmpty()) {
            System.out.println("No books available in the library!");
        } else {
            System.out.println("Available Books:");
            TreeSet<String> sortedBooks = new TreeSet<>(set); // Sort books alphabetically
            for (String book : sortedBooks) {
                System.out.println("- " + book);
            }
        }
    }


    public void addBook(HashSet<String> set) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the book name: ");
        String book = sc.nextLine().trim();
        if (set.contains(book)) {
            System.out.println("The book \"" + book + "\" is already available in the library!");
        } else {
            set.add(book);
            System.out.println("The book \"" + book + "\" has been added successfully!");
        }
    }


    public void searchBook(HashSet<String> set) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the book name to search: ");
        String book = sc.nextLine().trim();
        if (set.contains(book)) {
            System.out.println("The book \"" + book + "\" is available in the library!");
        } else {
            System.out.println("The book \"" + book + "\" is not available in the library.");
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library library = new Library();
        HashSet<String> lib = new HashSet<>();


        lib.add("The Jungle Book");
        lib.add("Dracula");
        lib.add("The GodFather");
        lib.add("The Wall - E");
        lib.add("Exorcists");
        lib.add("It Ends With Us");

        System.out.println("Welcome to Mobiloitte Library!");

        while (true) {

            System.out.println("\nMenu:");
            System.out.println("1. Show available books");
            System.out.println("2. Add a book");
            System.out.println("3. Search for a book");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");


            int choice;
            if (sc.hasNextInt()) {
                choice = sc.nextInt();
                sc.nextLine();
            } else {
                System.out.println("Invalid input! Please enter a number.");
                sc.next();
                continue;
            }

            switch (choice) {
                case 1 -> library.showBooks(lib);
                case 2 -> library.addBook(lib);
                case 3 -> library.searchBook(lib);
                case 4 -> {
                    System.out.println("Thank you for using the Mobiloitte Library. Goodbye!");
                    sc.close();
                    return;
                }
                default -> System.out.println("Invalid choice! Please select a valid option.");
            }
        }
    }
}
