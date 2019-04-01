package com.example.lingard.ipctest.CommandandResponsibility;

/**
 * Created by lingard on 2019/3/29.
 */

public class FileManger {
    //ls命令
    public static String ls(String path){
        return "file1\nfile2\nfile3\nfile4";
    }
    //ls -l命令
    public static String ls_l(String path){
        String str = "drw-rw-rw root system 1024 2009-8-20 10:23 file1\n";
        str = str + "drw-rw-rw root system 1024 2009-8-20 10:23 file2\n";
        str = str + "drw-rw-rw root system 1024 2009-8-20 10:23 file3";
        return str;
    }
    //ls -a命令
    public static String ls_a(String path){
        String str = ".\n..\nfile1\nfile2\nfile3";
        return str;
    }
}
