package org.example;

import java.util.ArrayList;
import java.util.Scanner;

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

        Member member1 = new Member(123456,"Seth","39 Brooklyn Works", "hassan@test.com", new LibraryCard(true));
        Member member2 = new Member(123455,"Dean","6a Sylvester Street", "Joe@test.com", new LibraryCard(true));
        Member member3 = new Member(123454,"Roman","26 The Friary", "Moe@test.com", new LibraryCard(false));

        library.addMember(member1);
        library.addMember(member2);
        library.addMember(member3);

        Librarian librarian1 = new Librarian(636463,"Charlotte","", "Charlotte@thelibrary.com");
        Librarian librarian2 = new Librarian(857323,"Sasha","", "Sasha@ggnoremail.com");
        Librarian librarian3 = new Librarian(902578,"Bianca","", "Bianca@ggnoremail.com");

        library.addLibrarian(librarian1);
        library.addLibrarian(librarian2);
        library.addLibrarian(librarian3);
    }
     //(Scanner) Get a book name, find a book matching this name
        System.out.println("Enter the book you are looking for.");
    String bookTitleToLookFor = scanner.nextLine();

    BookItem bookByTitle = null;
    String wantedBookName = null;

        try {
        bookByTitle = library.getBookByTitle(bookTitleToLookFor);
        wantedBookName = bookByTitle.getName();
        String bookByTitleAuthor = bookByTitle.getAuthor();
        long bookByTitleISBN = bookByTitle.getISBN();
        System.out.println("The book you are looking for, " + wantedBookName + ", by " + bookByTitleAuthor + ", has ISBN " + bookByTitleISBN + ".");
    } catch (Exception error) {
        System.out.println(error);
    }


}