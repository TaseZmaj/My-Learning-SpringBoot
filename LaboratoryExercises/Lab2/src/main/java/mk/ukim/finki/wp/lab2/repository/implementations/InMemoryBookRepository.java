package mk.ukim.finki.wp.lab2.repository.implementations;

import mk.ukim.finki.wp.lab2.bootstrap.DataHolder;
import mk.ukim.finki.wp.lab2.model.Book;
import mk.ukim.finki.wp.lab2.repository.BookRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemoryBookRepository implements BookRepository {

    @Override
    public List<Book> findAll(){
        return DataHolder.books;
    }

    @Override
    public List<Book> searchBooks(String text, double rating){
        List<Book> targetBooks = new ArrayList<>();
        for (Book book : DataHolder.books){
            if(book.getTitle().toLowerCase().contains(text.toLowerCase()) && book.getAverageRating() >= rating){
                targetBooks.add(book);
            }
        }
        return targetBooks;
    }
}
