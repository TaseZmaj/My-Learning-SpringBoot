package org.example.auditoryexercise2.bootstrap;

import jakarta.annotation.PostConstruct;
import org.example.auditoryexercise2.model.Category;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component //znachi deka ke se instancira samata klasa koga ke startuva aplikacijata
public class DataHolder {

    public static List<Category> categories = new ArrayList<Category>();

    //init()
    // --> nema sam po sebe da se povika zatoa:
    @PostConstruct
    public void init(){
        categories.add(new Category("Software", "(Software Description)"));
        categories.add(new Category("Movies", "(Movies Description)"));
        categories.add(new Category("Books", "(Books Description)"));
    }
}
