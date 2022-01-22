package Collections;

import java.util.*;

public class ArrayListDemo {
    int rollno;
    int age;
    String name;


    ArrayListDemo(int rollno, int age, String name) {
        this.rollno = rollno;
        this.age = age;
        this.name = name;

    }

    public static void main(String[] args) {
        //Creating user-defined class objects
        ArrayListDemo s1 = new ArrayListDemo(12, 30, "Ravi");
        ArrayListDemo s2 = new ArrayListDemo(21, 40, "srinu");
        //creating arraylist
        ArrayList<ArrayListDemo> al = new ArrayList<ArrayListDemo>();
        al.add(s1);
        al.add(s2);

        Iterator ele = al.iterator();
        while (ele.hasNext()) {
            ArrayListDemo st = (ArrayListDemo) ele.next();
            System.out.println(st.age + "" + st.rollno + "" + st.name);
        }

        al.forEach(a -> {
                    System.out.println(a.age);
                }
        );
        for (ArrayListDemo m : al) {
            System.out.println(m.age);

        }
        // Arraylist is a default class in java
        // Dynamic array
        //default generics

        ArrayList<Object> ar = new ArrayList<Object>();
        ar.add(200);//0
        ar.add(300);//1
        ar.add("ravi");//2
        ar.add(500);//3
        System.out.println(ar.size());
        System.out.println(ar.get(2));
        System.out.println(ar);
        System.out.println("HI:" + (ar.size() - 1));

        System.out.println(".........for loop........");
        // typical for loop
        for (int i = 0; i < ar.size(); i++) {
            System.out.println((ar.get(i)));
        }

        System.out.println(".........for each loop........");
        //for each loop

        for (Object o : ar) {
            System.out.println(o);
        }

        System.out.println(".........lambda........");
        //jdk8- streams lambda

        //}ar.stream().forEach(ele -> System.out.println(ele));

        //Lambda expression:->
        ar.forEach(t -> System.out.println(t));

        //method References
        ar.forEach(System.out::println);

        System.out.println(".........iterator........");
        Iterator<Object> it = ar.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println(".................");
        ArrayList<String> names = new ArrayList<String>(Arrays.asList("java", "python", "Ruby", "lambda", ".net", "Cucumber"));
        ArrayList<String> sublist = new ArrayList<String>(names.subList(2, 4));
        System.out.println(".........sublist........");
        System.out.println(sublist);
        names.forEach(t -> System.out.println(t));


        for (String n : names) {
            System.out.println(n);
        }

        Iterator<String> st = names.iterator();
        while (st.hasNext()) {
            System.out.println(st.next());
        }

        System.out.println("******************");
        for (int j = 0; j > names.size(); j++) {
            System.out.println(names.get(j));
        }

        HashSet<Integer> dublicate = new HashSet<Integer>();
        dublicate.add(2434);
        dublicate.add(234534);
        dublicate.add(2434);
        System.out.println(dublicate);
        System.out.println("###############");
        //lambda
        dublicate.forEach(t -> System.out.println(t));

        // Iterator
        Iterator<Integer> it1 = dublicate.iterator();
        while (it1.hasNext()) {
            System.out.println(it1.next());

        }
        for (Integer i : dublicate) {
            System.out.println(i);
        }

        TreeSet<Integer> dublicate1 = new TreeSet<Integer>();
        dublicate1.add(4);
        dublicate1.add(2);
        dublicate1.add(10);

        System.out.println(dublicate1);

        Iterator<Integer> it3 = dublicate1.iterator();
        while (it3.hasNext()) {
            System.out.println(it3.next());
        }


    }
}




