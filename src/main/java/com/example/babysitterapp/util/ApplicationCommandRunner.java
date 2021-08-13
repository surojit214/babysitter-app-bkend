package com.example.babysitterapp.util;

import com.example.babysitterapp.entities.*;
import com.example.babysitterapp.enums.GenderType;
import com.example.babysitterapp.repo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class ApplicationCommandRunner implements CommandLineRunner {
    /*@Autowired
    PersonRepo personRepo;

    @Autowired
    BookRepo bookRepo;

    @Autowired
    PersonDetailRepo personDetailRepo;

    @Autowired
    CategoryRepo categoryRepo;

    @Autowired
    AccountRepo accountRepo;*/

    @Override
    @Transactional
    public void run(String... args) throws Exception {
        /*Person p1 = new Person("Mickey", "Mouse", 35, GenderType.MALE);
        Person p2 = new Person("Donald", "Duck", 30, GenderType.MALE);
        Person p3 = new Person("Daisy", "Duck", 32, GenderType.FEMALE);
        Person p4 = new Person("Peppa", "Pig", 15, GenderType.FEMALE);
        Person p5 = new Person("Suzie", "Sheep", 18, GenderType.FEMALE);
        personRepo.save(p1);
        personRepo.save(p2);
        personRepo.save(p3);
        personRepo.save(p4);
        personRepo.save(p5);

        List<Person> all = personRepo.findAll();
        all.stream().forEach(System.out::println);

        *//*p1.setAge(45);
        p1.setFirstName("Mini");
        p1.setGender(GenderType.FEMALE);*//*

        Person mp = new Person();
        mp.setId(1);
        mp.setFirstName("Mini");
        mp.setGender(GenderType.FEMALE);

        personRepo.save(mp);

        List<Person> all1 = personRepo.findAll();
        all1.stream().forEach(System.out::println);

        Person dp = new Person();
        dp.setId(1);

        personRepo.delete(dp);

        List<Person> all2 = personRepo.findAll();
        all2.stream().forEach(System.out::println);

        List<Person> maleMembers = personRepo.findAllByGender(GenderType.FEMALE);

        maleMembers.stream().forEach(System.out::println);*/

        /*Book book = new Book("System Design", "Fowler", "Architecture", 100);
        BookDetail detail = new BookDetail(123456789, "Mcgrawhill", 625);
        book.setBookDetail(detail);
        detail.setBook(book);
        bookRepo.save(book);

        Book one = bookRepo.findById(1).get();
        System.out.println(one);*/

        /*Person person = new Person("Surojit", "Dasgupta", 39, GenderType.MALE);
        PersonDetail detail = new PersonDetail("ARYPD6053D", "4321 5575 3668", "L1456432");
        person.setPersonDetail(detail);
        personRepo.save(person);

        Optional<Person> per = personRepo.findById(1);
        System.out.println(per.get());*/

        /*PersonDetail detail = new PersonDetail("ARYPD6053D", "4321 5575 3668", "L1456432");
        Person person = new Person("Surojit", "Dasgupta", 39, GenderType.MALE);
        detail.setPerson(person);
        person.setPersonDetail(detail);
        personDetailRepo.save(detail);

        Optional<PersonDetail> per = personDetailRepo.findById(1);
        System.out.println(per.get());*/

//        saveBookCategory();

//        categoryRepo.save(category);

//        List<Book> book2 = bookRepo.findAll();
//        book2.stream().forEach(System.out::println);

//        bookRepo.delete(book1);

//        fetchCategory();

        /*Category category = new Category("Java", "No. 1 programming language");
//        categoryRepo.save(category);

        Book book = new Book("Concurrency in Java", "Fowler", category, 320);
        BookDetail detail = new BookDetail(123456789, "Mcgrawhill", 625);
        book.setBookDetail(detail);
        detail.setBook(book);
        bookRepo.save(book);

        Book book1 = new Book("Data structure in Java", "Martin", category, 350);
        BookDetail detail1 = new BookDetail(759372304, "Wrox", 300);
        book1.setBookDetail(detail1);
        detail1.setBook(book1);
        bookRepo.save(book1);

        category.setBooks(Arrays.asList(book, book1));

        List<Category> cat = categoryRepo.findAll();
        cat.forEach(System.out::println);*/

        /*savePersonAccount();

        getAccountDetails();*/

        /*Category category = new Category("Java", "No. 1 programming language");
        categoryRepo.save(category);
        Book book = new Book("Concurrency in Java", category, 320);
        BookDetail detail = new BookDetail(123456789, "Mcgrawhill", 625);
        book.setBookDetail(detail);
        detail.setBook(book);

        Author author = new Author("Martin Fowler", "Promotion of micro-service");
        Author author1 = new Author("Cathy Seira", "Data structure & Algorithms");
        Author author2 = new Author("Chad Derby", "Java and Angular specialization");

        book.setAuthors(Arrays.asList(author, author1));
        bookRepo.save(book);

        Book book1 = new Book("Multithreading in Java", category, 568);
        BookDetail detail1 = new BookDetail(789987820, "Tata", 132  );
        book1.setBookDetail(detail1);
        detail1.setBook(book1);

        book1.setAuthors(Arrays.asList(author1, author2));
        bookRepo.save(book1);*/
    }

    /*@Transactional
    public void getAccountDetails() {
        accountRepo.findAll().stream().forEach(System.out::println);
    }

    @Transactional
    public void savePersonAccount() {
        Person person = new Person("Surojit", "Dasgupta", 39, GenderType.MALE);
        Account savings = new Account("CITI3844", "Savings");
        Account credit = new Account("CITI6892", "Credit");
        PersonDetail detail = new PersonDetail("ARYPD6053D", "4321 5575 3668", "L1456432");
        person.setPersonDetail(detail);
        person.setAccount(Arrays.asList(savings, credit));
        savings.setPerson(person);
        credit.setPerson(person);

        personRepo.save(person);
    }

    @Transactional
    public void fetchCategory() {
        List<Category> cat = categoryRepo.findAll();
        cat.forEach(System.out::println);
    }*/

    /*@Transactional
    public void saveBookCategory() {
        Category category = new Category("Java", "No. 1 programming language");
        categoryRepo.save(category);

        System.out.println(category);

        Book book = new Book("Concurrency in Java", "Fowler", category, 320);
        BookDetail detail = new BookDetail(123456789, "Mcgrawhill", 625);
        book.setBookDetail(detail);
        detail.setBook(book);
        bookRepo.save(book);

        System.out.println(category);

        Book book1 = new Book("Data structure in Java", "Martin", category, 350);
        BookDetail detail1 = new BookDetail(759372304, "Wrox", 300);
        book1.setBookDetail(detail1);
        detail1.setBook(book1);
        bookRepo.save(book1);

//        category.setBooks(Arrays.asList(book, book1));
        System.out.println(category);
    }*/
}
