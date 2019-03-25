package com.example.lingard.ipctest.OCP;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by lingard on 2019/3/1.
 */

public class BookStore {
    private static List<IBook> bookList = new ArrayList<IBook>();
    static {
        bookList.add(new NovelBook("天龙八部",3200,"金庸"));
        bookList.add(new NovelBook("悲惨世界",1600,"雨果"));
        bookList.add(new NovelBook("巴黎圣母院",4800,"雨果"));
        bookList.add(new NovelBook("五三",3200,"王中原"));
        bookList.add(new ComputerBook("Thinking in Java","B.E" ,3000, "Code"));
    }

    public static void main(String[] args){
        NumberFormat format = NumberFormat.getCurrencyInstance();
        format.setMaximumFractionDigits(2);
        for (IBook iBook : bookList){
            System.out.println("名："+iBook.getName()+ "\t钱：" + format.format(iBook.getPrice())+"yuan"
                    + "\t人：" + iBook.getAuthor() );
        }
    }
}
