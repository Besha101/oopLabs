package org.example.week7.a2ndTask;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class LibraryCatalog {

    private List<Book> books;

    public LibraryCatalog(List<Book> books){
        this.books=new ArrayList<>(books);
    }

    public List<Book> getBooks(){
        return books;
    }

    public Optional<Boolean> checkAvailability(String title){
        return books.stream()
                .filter(book -> book.title().equalsIgnoreCase(title))
                .findFirst()
                .map(Book::availabilityStatus);
    }

    public Optional<Book> getFirstAvailableBookByAuthor(String author){
        return books.stream()
                .filter(book -> book.author().equalsIgnoreCase(author) && book.availabilityStatus())
                .findFirst();
    }

    public void updateAvailability(String title, boolean available){
        books.stream()
                .filter(book -> book.title().equalsIgnoreCase(title))
                .findFirst()
                .ifPresent(book -> book=new Book(book.title(), book.author(), book.pYear(), book.availabilityStatus()));
    }

}
