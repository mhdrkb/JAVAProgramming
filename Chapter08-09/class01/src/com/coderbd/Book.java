
package com.coderbd;


public class Book {
    
    ////initialize instance variables
    int BookId;
    String BookName;
    String Author;
///generate default constructor (mendatory)
    public Book() {
    }
///geenrate argumentative constructor
    public Book(int BookId, String BookName, String Author) {
        this.BookId = BookId;
        this.BookName = BookName;
        this.Author = Author;
    }
    
    
///starting main method    
    public static void main(String[] args) {
        Book book01 = new Book(101, "Physics", "Topon Hasan Chowdhury");
        System.out.println("Book ID: " + book01.getBookId() + "\n" + "Book Name: " + book01.getBookName() + "\n" + "Book Author : " + book01.getAuthor() + "\n");
    }
///using getter method without setter cause the values are assigned dirrectly
    public int getBookId() {
        return BookId;
    }

    public String getBookName() {
        return BookName;
    }

    public String getAuthor() {
        return Author;
    }
    
    
    
}
