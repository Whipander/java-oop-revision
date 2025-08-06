package org.libraryManagement.library;

import java.util.List;
import java.util.stream.Collectors;

public class Library {
    private List<Book> books;

    public void addBook(Book book) {
        if (books.contains(book)) {
            throw new IllegalArgumentException("Book already exists");
        } else {
            books.add(book);
            System.out.println("The book : '" + book.getTitle() + "' has been added");
        }
    }

    public void removeBook(String isbn) {
        if (books.removeIf(book -> book.getIsbn().equals(isbn))) {
            System.out.println("The book : '" + isbn + "' has been removed");
        } else {
            throw new IllegalArgumentException("The book with the ISBN: '" + isbn + "' has not been found");
        }
    }

    public Book searchBookByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                return book;
            }
        }
        throw new IllegalArgumentException("The book with the title: '" + title + "' has not been found");
    }

    public List<Book> searchBooksByAuthor(String author) {
        return books.stream().
                filter(book -> book.getAuthor().equals(author))
                .collect(Collectors.toList());
    }
}
