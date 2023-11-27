package org.example;

abstract public class Book {
    protected String title;
    protected String author;
    protected String isbn;
    protected int stockQuantity;

    public Book(String title, String author, String isbn, int stockQuantity) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.stockQuantity = stockQuantity;
    }

    // Getters and setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    // Methods
    public void increaseStockQuantity(int amount) {
        stockQuantity += amount;
    }

    public void decreaseStockQuantity(int amount) {
        stockQuantity -= amount;
    }

    public String getBookDetails() {
        return "Title: " + title + ", Author: " + author + ", ISBN: " + isbn + ", Stock: " + stockQuantity;
    }

    abstract public void displayBookDetails();
}
