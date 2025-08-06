package org.libraryManagement.library;

import java.util.Objects;

public class Book {
    private String title;
    private String author;
    private int publishYear;
    private String isbn;

    public Book(String title, String author, int publishYear, String isbn) {
        this.title = title;
        this.author = author;
        this.publishYear = publishYear;
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;

    }

    public String getAuthor() {
        return author;
    }

    public int getPublishYear() {
        return publishYear;
    }

    public String getIsbn() {
        return isbn;
    }

    @Override
    public String toString() {
        return "Book:\n" +
                "Title: '" + title + "'\n" +
                "Author: '" + author + "'\n" +
                "Published in: '" + publishYear + "'\n" +
                "ISBN: '" + isbn + "'\n";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publishYear == book.publishYear && Objects.equals(title, book.title) && Objects.equals(author, book.author) && Objects.equals(isbn, book.isbn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, publishYear, isbn);
    }
}
