package com.example.babysitterapp.entities;

import javax.persistence.*;

//@Entity
@Table(name = "BOOK_DETAIL")
public class BookDetail {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "ISBN")
    private int isbn;
    @Column(name = "PUBLISHER")
    private String publisher;
    @Column(name = "NO_OF_PAGES")
    private int noOfPages;
    @OneToOne(targetEntity = Book.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "BOOK_ID")
    private Book book;

    public BookDetail() {
    }

    public BookDetail(int isbn, String publisher, int noOfPages) {
        this.isbn = isbn;
        this.publisher = publisher;
        this.noOfPages = noOfPages;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getNoOfPages() {
        return noOfPages;
    }

    public void setNoOfPages(int noOfPages) {
        this.noOfPages = noOfPages;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    @Override
    public String toString() {
        return "BookDetail{" +
                "id=" + id +
                ", isbn=" + isbn +
                ", publisher='" + publisher + '\'' +
                ", noOfPages=" + noOfPages +
                '}';
    }
}
