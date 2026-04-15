package com.example.goodreadsorm.model;

import jakarta.persistence.*;



@Entity
@Table(name="book")
public class Book {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;
    @Column(name="name")
    private String name;
    @Column(name="image_Url")
    private String image_Url;

    public Integer getId() {
        return id;
    }

    public Book(Integer id, String name, String imageUrl) {
        this.id = id;
        this.name = name;
        this.image_Url = imageUrl;
    }

    public Book() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImageUrl() {
        return image_Url;
    }

    public void setImageUrl(String imageUrl) {
        this.image_Url = imageUrl;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
