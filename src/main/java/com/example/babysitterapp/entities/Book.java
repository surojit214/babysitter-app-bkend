package com.example.babysitterapp.entities;

import javax.persistence.*;
import java.util.List;

//@Entity
@Table(name = "BOOK")
public class Book {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "BOOK_NAME")
    private String bookName;
    @Column(name = "NO_OF_COPIES")
    private int noOfCopies;
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "book", targetEntity = BookDetail.class)
    private BookDetail bookDetail;
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
    @JoinColumn(name = "CATEGORY_ID")
    private Category category;
    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(name = "BOOK_AUTHOR", joinColumns = {@JoinColumn(name = "BOOK_ID")}, inverseJoinColumns = {@JoinColumn(name = "AUTHOR_ID")})
    private List<Author> authors;

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

    public Book() {
    }

    public Book(String bookName, Category category, int noOfCopies) {
        this.bookName = bookName;
        this.noOfCopies = noOfCopies;
        this.category = category;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getNoOfCopies() {
        return noOfCopies;
    }

    public void setNoOfCopies(int noOfCopies) {
        this.noOfCopies = noOfCopies;
    }

    public BookDetail getBookDetail() {
        return bookDetail;
    }

    public void setBookDetail(BookDetail bookDetail) {
        this.bookDetail = bookDetail;
    }

    @Override
    public String toString() {
        return "Book { \n" +
                " id=" + id + ", \n" +
                " bookName='" + bookName + '\'' + ", \n" +
//                " category='" + category + '\'' + ", \n" +
                " noOfCopies='" + noOfCopies + '\'' + ", \n" +
                " bookDetail='" + bookDetail + '\'' + "\n" +
                '}';
    }
}
