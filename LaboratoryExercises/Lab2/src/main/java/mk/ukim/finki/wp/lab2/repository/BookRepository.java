package mk.ukim.finki.wp.lab2.repository;

import mk.ukim.finki.wp.lab2.model.Book;

import java.util.List;

public interface BookRepository {
    List<Book> findAll();
    List<Book> searchBooks(String text, double rating);
}
