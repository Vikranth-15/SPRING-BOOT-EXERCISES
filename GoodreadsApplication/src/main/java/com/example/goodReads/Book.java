package com.example.goodReads;

public class Book {
    private int id;

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    private String name;
    private  String imageUrl;
    public Book(int id,String name,String imageUel){
        this.id=id;
        this.name=name;
        this.imageUrl=imageUel;
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
