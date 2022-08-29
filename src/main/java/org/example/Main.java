package org.example;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

    public class Main {

        public static void main(String[] args) throws IOException, CsvException {
            
//            Member member1 = new Member(123456,"Seth","39 Brooklyn Works", "hassan@test.com", new LibraryCard(true));
//            Member member2 = new Member(123455,"Dean","6a Sylvester Street", "Joe@test.com", new LibraryCard(true));
//            Member member3 = new Member(123454,"Roman","26 The Friary", "Moe@test.com", new LibraryCard(false));
//
//            Library library = null;
//            library.addMember(member1);
//            library.addMember(member2);
//            library.addMember(member3);
//
//            Librarian librarian1 = new Librarian(636463,"Charlotte","", "Charlotte@thelibrary.com");
//            Librarian librarian2 = new Librarian(857323,"Sasha","", "Sasha@ggnoremail.com");
//            Librarian librarian3 = new Librarian(902578,"Bianca","", "Bianca@ggnoremail.com");
//
//            library.addLibrarian(librarian1);
//            library.addLibrarian(librarian2);
//            library.addLibrarian(librarian3);

            String fileName = "C:\\Users\\User\\Desktop\\books_data.csv";


            List<String[]> r;
            try (CSVReader reader = new CSVReader(new FileReader(fileName))) {
                r = reader.readAll();
            }

            int listIndex = 0;
            for (String[] arrays : r) {
                System.out.println("\nDetails[" + listIndex++ + "] : " + Arrays.toString(arrays));

                int index = 0;
                for (String array : arrays) {
                    System.out.println(index++ + " : " + array);
                }

            }
        }

       
    }


