import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        String bookName, authorName, ISBN;
        int  PGNo;
        // Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "123456789", 180);
        // Book book2 = new Book("1984", "George Orwell", "987654321", 328);
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Book name");
        bookName = scan.nextLine();
        System.out.println("Enter author name");
        authorName = scan.nextLine();
        System.out.println("Enter ISBN");
        ISBN = scan.nextLine();
        System.out.println("Enter page Number");
        PGNo = scan.nextInt();

        Book item = new Book(bookName, authorName, ISBN, PGNo);

        library.addItem(item);
        library.addItem(item);
        library.listItems();
    }
}
