package Generics;

import Lombok.Cat;
import Lombok.Dog;

public class GenricsExample extends Printer{
String thingsToEat;

    public static void main(String[] args) {
        GenricsExample ge = new GenricsExample(20,"john","nuts");
        System.out.println(ge.age+","+ge.name+","+ge.thingsToEat);

        //Printer<Integer> printer=new Printer<Integer>(24);
        //Printer<Double> printer=new Printer<Double>(33.5);
        //Printer<Cat> printer = new Printer<Cat>(new Cat());
        //printer.print();
        ge.shout("Ravi", 56);


    }

    public <T, V> T shout(T thingToShout, V otherThingToShout) {
        System.out.println(thingToShout + "," + otherThingToShout);
        return thingToShout;

    }

    public GenricsExample(int age,String name,String thingsToEat){
        super(age,name);
        this.thingsToEat=thingsToEat;
    }
}
