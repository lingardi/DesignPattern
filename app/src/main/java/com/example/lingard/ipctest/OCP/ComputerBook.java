package com.example.lingard.ipctest.OCP;

/**
 * Created by lingard on 2019/3/1.
 */

public class ComputerBook implements IComputerBook {
    private String name;
    private int price;
    private String author;
    private String scope;

    public ComputerBook(String name, String author, int price, String scope){
        this.name = name;
        this.author = author;
        this.price = price;
        this.scope = scope;
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

    @Override
    public String getScope() {
        return scope;
    }
}
