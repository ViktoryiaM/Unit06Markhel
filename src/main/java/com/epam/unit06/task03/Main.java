package com.epam.unit06.task03;

import java.math.BigDecimal;

public class Main {
  public static void main(String[] args) {
    Book book1 = new Book();
    book1.setId(1);
    book1.setYear(1994);
    book1.setPages(302);
    book1.setName("Harry Potter");
    book1.setAuthor("J.K.Rowling");
    book1.setPublisher("Rosmen");
    book1.setCover("Hard");
    book1.setCost(BigDecimal.valueOf(35.0000));

    Book book2 = new Book();
    book2.setId(2);
    book2.setYear(1995);
    book2.setPages(303);
    book2.setName("Harry Potter. Part 2");
    book2.setAuthor("J.K.Rowling");
    book2.setPublisher("Rosmen");
    book2.setCover("Soft");
    book2.setCost(BigDecimal.valueOf(35.0000));

    Book book3 = new Book();
    book3.setId(3);
    book3.setYear(1996);
    book3.setPages(304);
    book3.setName("Harry Potter. Part 3");
    book3.setAuthor("J.K.Rowling");
    book3.setPublisher("Rosmen");
    book3.setCover("Soft");
    book3.setCost(BigDecimal.valueOf(35.0000));

    Book book4 = new Book();
    book4.setId(4);
    book4.setYear(1997);
    book4.setPages(305);
    book4.setName("Harry Potter. Part 4");
    book4.setAuthor("J.K.Rowling");
    book4.setPublisher("Rosmen");
    book4.setCover("Hard");
    book4.setCost(BigDecimal.valueOf(35.0000));

    Book book5 = new Book();
    book5.setId(5);
    book5.setYear(1998);
    book5.setPages(306);
    book5.setName("Harry Potter. Part 5");
    book5.setAuthor("J.K.Rowling");
    book5.setPublisher("Rosmen");
    book5.setCover("Soft");
    book5.setCost(BigDecimal.valueOf(35.0000));

    Book book6 = new Book();
    book6.setId(6);
    book6.setYear(1990);
    book6.setPages(500);
    book6.setName("The Lord Of The Rings");
    book6.setAuthor("J.R.R Tolkien");
    book6.setPublisher("Rosmen");
    book6.setCover("Hard");
    book6.setCost(BigDecimal.valueOf(100.0));

    Library library = new Library(15);
    library.addBook(book1);
    library.addBook(book2);
    library.addBook(book3);
    library.addBook(book4);
    library.addBook(book5);
    library.addBook(book6);


    Book[] after1996 = library.findByYear(1996);
    for (int i = 0; i < after1996.length; i++) {
      if (after1996[i] != null) {
        System.out.println("Title: " + after1996[i].getName());
      }
    }
    Book[] byAuthor = library.findByAuthor("J.R.R Tolkien");
    for (int i = 0; i < byAuthor.length; i++) {
      if (byAuthor[i] != null) {
        System.out.println("Title: " + byAuthor[i].getName());
      }
    }
  }
}