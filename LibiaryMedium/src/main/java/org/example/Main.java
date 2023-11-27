package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        Book novel = new Novel("The Alchemist", "Paulo Coelho", "123456", 10, 1988);
        Book scientificBook = new ScientificBook("A Brief History of Time", "Stephen Hawking", "654321", 5, 1988);
        Book magazine = new Magazine("National Geographic", "Various", "987654", 20, "Monthly");

        library.addBook(novel);
        library.addBook(scientificBook);
        library.addBook(magazine);

        library.displayAllBooks();

        library.displayAllBooksInFrame();

    }
}
