package com.example.goodReads;

public class Book {
    private Integer id;

    public String getImageUrl() {
        return imageUrl;
    }
    public Book() {
    }

    public void setImageUrl(String imageUrl){
        this.imageUrl=imageUrl;
    }


    private String name;
    private  String imageUrl;
    public Book(int id,String name,String imageUrl){
        this.id=id;
        this.name=name;
        this.imageUrl=imageUrl;
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

    public int getId(){
        return id;
    }
}
