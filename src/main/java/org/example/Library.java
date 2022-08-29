package org.example;

import java.util.ArrayList;

public class Library {
    private ArrayList<Librarian> librarians;
    private ArrayList<Member> members;
    private ArrayList<BookItem> availableBooks;
    private ArrayList<BookItem> rentedBooks;

    //    Constructor
    public Library(ArrayList<Librarian> librarians, ArrayList<Member> members, ArrayList<BookItem> availableBooks, ArrayList<BookItem> rentedBooks) {
        this.librarians = librarians;
        this.members = members;
        this.availableBooks = availableBooks;
        this.rentedBooks = rentedBooks;
    }

}
