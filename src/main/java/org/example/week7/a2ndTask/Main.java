package org.example.week7.a2ndTask;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Book> bookList = List.of(
                new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925, true),
                new Book("To Kill a Mockingbird", "Harper Lee", 1960, true),
                new Book("1984", "George Orwell", 1949, false),
                new Book("The Catcher in the Rye", "J.D. Salinger", 1951, true),
                new Book("Pride and Prejudice", "Jane Austen", 1813, true)
        );

        LibraryCatalog libraryCatalog=new LibraryCatalog(bookList);
        String searchTitle="1984";
        libraryCatalog.checkAvailability(searchTitle)
                .ifPresentOrElse(availabilityStatus->System.out.println(searchTitle + " is " + (availabilityStatus ? "available" : "not available")),
                        () -> System.out.println("Book with title " + searchTitle + " not found"));

        String searchAuthor = "J.D. Salinger";
        libraryCatalog.getFirstAvailableBookByAuthor(searchAuthor)
                .ifPresentOrElse(
                        book -> System.out.println("First available book by " + searchAuthor + ": " + book),
                        () -> System.out.println("No available books found by " + searchAuthor));

        String updateTitle = "To Kill a Mockingbird";
        libraryCatalog.updateAvailability(updateTitle, false);
        System.out.println(updateTitle + " availability updated.");

        libraryCatalog.getBooks().forEach(book -> System.out.println(book.title() + ": " + (book.availabilityStatus() ? "available" : "not available")));

    }



}
