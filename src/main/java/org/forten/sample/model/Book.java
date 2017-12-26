package org.forten.sample.model;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Book {
    private int id;
    private String name;
    private String author;
    private int price;
    private String press;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date pubDate;

    public Book() {
    }

    public Book(String name, String author, int price, String press, Date pubDate) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.press = press;
        this.pubDate = pubDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getPress() {
        return press;
    }

    public void setPress(String press) {
        this.press = press;
    }

    public Date getPubDate() {
        return pubDate;
    }

    public void setPubDate(Date pubDate) {
        this.pubDate = pubDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        return id == book.id;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", press='" + press + '\'' +
                ", pubDate=" + pubDate +
                '}';
    }
}
