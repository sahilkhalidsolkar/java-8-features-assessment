package org.example.demo.thirdAssessment;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@FunctionalInterface
interface AddbookLambda{
    void addBook(Book bk);
}

public class Library {
    List<Book> books ;
    Library(){
        books = new ArrayList<>();

    }
    public void addBooksToLib(Book book){

        AddbookLambda abl = books::add;
        abl.addBook(book);
    }
    public void displayBooksToLib(){
        books.forEach(System.out::println);
    }
    public Optional<Book>  searchBooksFromLib(String isbn){

        Book book = books.stream().filter((x) -> x.getIsbn().equals(isbn)).findFirst().orElse(new Book());
        return  Optional.ofNullable(book);

    }
    public List<Book> displayBooksByGenreToLib(String genre){
       return books.stream().filter(x->x.getGenre().equalsIgnoreCase(genre)).sorted(Comparator.comparing(Book::getTitle)).collect(Collectors.toList());
    }
    public void displayBooksByTitleToLib(){
         books.stream().map(Book::getTitle).forEach(System.out::println);
    }
}
