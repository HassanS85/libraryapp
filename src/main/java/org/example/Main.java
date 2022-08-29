package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // 1. Create a new library for us to interact with
        ArrayList<Librarian> librarians = new ArrayList<Librarian>(0);
        ArrayList<Member> members = new ArrayList<Member>(0);
        ArrayList<BookItem> availableBooks = new ArrayList<BookItem>(0);
        ArrayList<BookItem> rentedBooks = new ArrayList<BookItem>(0);

        Library library = new Library( librarians, members, availableBooks,  rentedBooks);

        // 2. Populate some available books in our library
        String fileName = "C:\\Users\\User\\Desktop\\books_data.csv";


        library.addAvailableBook(bookItem1);
        library.addAvailableBook(bookItem2);
        library.addRentedBook(bookItem3);


    }
}