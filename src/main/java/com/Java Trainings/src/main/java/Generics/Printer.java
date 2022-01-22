package Generics;

import Lombok.Cat;

public class Printer<T extends Cat> {

    T thingToPrint;
    int age;
    String name;
public Printer(){

}
    public Printer( T thingToPrint){
        this.thingToPrint=thingToPrint;

        }
    public void print(){
        thingToPrint.eat();
        System.out.println(thingToPrint);
    }
    public Printer(int age, String name){
    this.name=name;
    this.age=age;

    }
}
