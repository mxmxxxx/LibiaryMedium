package org.example;

public class Magazine extends Book {
    final private String publicationFrequency;

    public Magazine(String title, String author, String isbn, int stockQuantity, String publicationFrequency) {
        super(title, author, isbn, stockQuantity);
        this.publicationFrequency = publicationFrequency;
    }

    // Getters and setters
    public String getPublicationFrequency() {
        return publicationFrequency;
    }


    // ...


    @Override
    public String getBookDetails() {
        return super.getBookDetails() + ", PublicationFrequency: " + publicationFrequency;
    }
    @Override
    public void displayBookDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
        System.out.println("Stock Quantity: " + stockQuantity);
        System.out.println("Publication Frequency: " + publicationFrequency);
    }
}
