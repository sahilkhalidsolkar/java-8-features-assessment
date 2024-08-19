package org.example.demo.thirdAssessment;

import java.util.Optional;

public class Main {
        public static void main(String[] args) {
        Library library = new Library();
        Book b1 = new Book("Harry" ,"JK Rowling","scifi","123456");
        Book b2 = new Book("Harry2" ,"JK Rowling2","fantasy","208342");
        Book b3 = new Book("Harry3" ,"JK Rowling3","drama","863924");
        Book b4 = new Book("Harry4" ,"JK Rowling4","scifi","098765");
        Book b5 = new Book("Abcd" ,"JK Rowling4","scifi","098709");
        Book b6 = new Book("Ab" ,"JK Rowling4","scifi","098709");


        library.addBooksToLib(b1);
        library.addBooksToLib(b2);
        library.addBooksToLib(b3);
        library.addBooksToLib(b4);
        library.addBooksToLib(b5);
        library.addBooksToLib(b6);

                System.out.println("------------------Searching for book");
                Optional<Book> book = library.searchBooksFromLib("863924");
                System.out.println(book.get());
                System.out.println("--------------------filter by genre and sorting them by title");
                library.displayBooksByGenreToLib("scifi").forEach(System.out::println);
                System.out.println("----------------Displaying all the Books from library");

                library.displayBooksToLib();
                System.out.println("----------------Displaying by title");
                library.displayBooksByTitleToLib();
        }
}




