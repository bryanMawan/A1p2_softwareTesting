package a1p2_softwaretesting;

public class Book {
    private String title;
    private String author;
    private int year;
    private String isbn;

    // Constructor
    public Book(String title, String author, int year, String isbn) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.isbn = isbn;
    }

    public String getTitle() { return title;}
    public String getAuthor() { return author; }
    public int getYear() { return year; }
    public String getIsbn() { return isbn; }
}


