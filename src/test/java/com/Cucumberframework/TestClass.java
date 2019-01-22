package com.Cucumberframework;

import org.apache.log4j.ConsoleAppender;

import java.util.Properties;

public class TestClass {
    public int age;
    public String name;

    TestClass (){
System.out.println("Default constructor");
    }

 /*   TestClass(int id, String name){
        System.out.println("name and age :" +id+" " +name);

    }*/
    public static void test(){
        System.out.println("test");
    }

    public void klm(int age, String name){

        this.age=age;
        this.name=name;
        System.out.println("test1");
    }
    public static void main(String[]args){

        TestClass test=new TestClass();
       // TestClass test1=new TestClass(20,"ravi");
        //TestClass test2=new TestClass(40,"ravi");




    }

}
