package org.example;

public class Novel extends Book {
    final private int publicationYear;

    public Novel(String title, String author, String isbn, int stockQuantity, int publicationYear) {
        super(title, author, isbn, stockQuantity);
        this.publicationYear = publicationYear;
    }

    // Getters and setters
    public int getPublicationYear() {
        return publicationYear;
    }
    // ...

    @Override
    public String getBookDetails() {
        return super.getBookDetails() + ", Year: " + publicationYear;
    }
    @Override
    public void displayBookDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
        System.out.println("Stock Quantity: " + stockQuantity);
        System.out.println("Publication Year: " + publicationYear);
    }
}
