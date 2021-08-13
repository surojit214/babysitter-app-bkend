package com.example.babysitterapp.entities;

import javax.persistence.*;
import java.util.List;

//@Entity
@Table(name = "AUTHOR")
public class Author {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "AUTHOR_NAME")
    private String authorName;
    @Column(name = "ABOUT_AUTHOR")
    private String aboutAuthor;
    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "authors")
    private List<Book> books;

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public Author() {
    }

    public Author(String authorName, String aboutAuthor) {
        this.authorName = authorName;
        this.aboutAuthor = aboutAuthor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getAboutAuthor() {
        return aboutAuthor;
    }

    public void setAboutAuthor(String aboutAuthor) {
        this.aboutAuthor = aboutAuthor;
    }

    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", authorName='" + authorName + '\'' +
                ", aboutAuthor='" + aboutAuthor + '\'' +
                '}';
    }
}
