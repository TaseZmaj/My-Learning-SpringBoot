package mk.ukim.finki.wp.lab3.service.implementations;

import lombok.AllArgsConstructor;
import mk.ukim.finki.wp.lab3.model.Author;
import mk.ukim.finki.wp.lab3.repository.AuthorRepository;
import mk.ukim.finki.wp.lab3.service.AuthorService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class AuthorServiceImpl implements AuthorService {

    private final AuthorRepository authorRepository;

    @Override
    public List<Author> findAll() {
        return authorRepository.findAll();
    }

    @Override
    public Author findById(long id) {
        return authorRepository.findById(id);
    }
}
