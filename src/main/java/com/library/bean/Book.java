package com.library.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

//书籍类
public class Book implements Serializable {
    private long book_id;
    private String name;     //书名
    private String author;   //作者
    private String publish;  //出版社
    private String ISBN;      //IBSN
    private String introduction;   //书籍简介
    private String language;       //书籍语言
    private BigDecimal price;      //书籍价格
    private Date pub_date;         //出版日期
    private int class_id;          //分类号
    private int number;             //编号
    public long getBookId() {
        return book_id;
    }
    public void setBookId(long book_id) {
        this.book_id = book_id;
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
    public String getPublish() {
        return publish;
    }
    public void setPublish(String publish) {
        this.publish = publish;
    }
    public String getIsbn() {
        return ISBN;
    }
    public void setIsbn(String isbn) {
        this.ISBN = isbn;
    }
    public String getIntroduction() {
        return introduction;
    }
    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }
    public String getLanguage() {
        return language;
    }
    public void setLanguage(String language) {
        this.language = language;
    }
    public BigDecimal getPrice() {
        return price;
    }
    public void setPrice(BigDecimal price) {
        this.price = price;
    }
    public Date getPubdate() {
        return pub_date;
    }
    public void setPubdate(Date pub_date) {
        this.pub_date = pub_date;
    }
    public int getClassId() {
        return class_id;
    }
    public void setClassId(int class_id) {
        this.class_id = class_id;
    }
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
}
