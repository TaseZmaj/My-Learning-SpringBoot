package mk.ukim.finki.wp.lab2.service;

import mk.ukim.finki.wp.lab2.model.Book;

import java.util.List;

public interface BookService {
    List<Book> listAll();
    List<Book> searchBooks(String text, double rating);
}
