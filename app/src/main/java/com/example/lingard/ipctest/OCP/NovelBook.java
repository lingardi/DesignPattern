package com.example.lingard.ipctest.OCP;

/**
 * Created by lingard on 2019/3/1.
 */

public class NovelBook implements IBook {
    private String name;
    private int price;
    private String author;

    public NovelBook(String name, int price, String author){
        this.name = name;
        this.author = author;
        this.price = price;
    }
    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String getAuthor() {
        return author;
    }

    @Override
    public String getName() {
        return name;
    }
}
