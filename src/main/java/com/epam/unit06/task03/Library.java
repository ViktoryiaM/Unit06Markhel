package com.epam.unit06.task03;

public class Library {

  private Book[] books;
  private int currentIndex;

  public Library(int size) {
    books = new Book[size];
    currentIndex = 0;
  }

  public Book[] findByAuthor(String author) {
    Book[] foundBooks = new Book[currentIndex];
    int pechenka = 0;
    for (int i = 0; i < currentIndex; i++) {
      if (books[i].getAuthor() == author) {
        foundBooks[pechenka] = books[i];
        pechenka++;
      }
    }
    return foundBooks;
  }

  public Book[] findByYear(int year) {
    Book[] foundBooks = new Book[currentIndex];
    int pechenka = 0;
    for (int i = 0; i < currentIndex; i++) {
      if (books[i].getYear() > year) {
        foundBooks[pechenka] = books[i];
        pechenka++;
      }
    }
    return foundBooks;
  }

  public Book[] getBooks() {
    return books;
  }

  public void setBooks(Book[] books) {
    this.books = books;
    currentIndex = books.length;
  }

  public void addBook(Book book) {
    if (books.length > currentIndex) {
      books[currentIndex] = book;
      currentIndex = currentIndex + 1;
    } else {
      throw new RuntimeException("Полка занята!");
    }
  }
}