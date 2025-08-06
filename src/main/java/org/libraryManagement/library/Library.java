package org.libraryManagement.library;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Library {
    private List<Book> books;

    public Library(List<Book> books) {
        this.books = books;
    }

    public Library() {
        this.books = new ArrayList<>();
    }

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

    public void displayBooks() {
        books.stream()
                .forEach(System.out::println);
    }

    public void displayBooksTitle() {
        books.stream()
                .forEach(b -> System.out.println(b.getTitle()));
    }

    public List<Book> booksPublishedAfter(int year) {
        return books.stream()
                .filter(book -> book.getPublishYear() > year)
                .collect(Collectors.toList());
    }

    public List<String> titlesAndAuthors() {
        return books.stream().
                map(b -> b.getTitle() + " - " + b.getAuthor())
                .collect(Collectors.toList());
    }

    public List<Book> sortedByPublishYear() {
        return books.stream()
                .sorted(Comparator.comparing(Book::getPublishYear))
                .collect(Collectors.toList());
    }

    public String authorWithMostBooks() {
        return books.stream()
                .collect(Collectors.groupingBy(Book::getAuthor, Collectors.counting()))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse("None");
    }
}
