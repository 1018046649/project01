package com.atguigu.bean;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
//这是单行注释
public class Customer {

    public static void main(String args[]){
        System.out.println("HelloWorld!!!!!");
        ArrayList list = new ArrayList();




    }

    public void method(){
        try {
            FileInputStream fis = new FileInputStream("hello.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}
