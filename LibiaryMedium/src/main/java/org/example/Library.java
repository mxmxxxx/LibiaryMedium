package org.example;

import java.util.ArrayList;
import java.util.List;

import javax.swing.*;
import java.awt.*;

public class Library {
    private List<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void displayAllBooks() {
        for (Book book : books) {
            book.displayBookDetails();
        }
    }

    public void displayAllBooksInFrame() {
        JFrame frame = new JFrame("Library Book Details");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        JTextArea textArea = new JTextArea();
        textArea.setEditable(false);

        for (Book book : books) {
            textArea.append(book.getBookDetails() + "\n\n");
        }

        JScrollPane scrollPane = new JScrollPane(textArea);
        frame.add(scrollPane, BorderLayout.CENTER);
        frame.setVisible(true);

    // Additional methods for lending, returning, etc.
    // ...
    }
}
