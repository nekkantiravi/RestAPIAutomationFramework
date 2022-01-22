package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class VirtualCapacity {
    public static void main(String[] args) {
        ArrayList<Integer> arc = new ArrayList<Integer>(20);


        System.out.println(arc.size());//Physical capacity=0 when no indexes are added.
        arc.add(100);

        System.out.println(arc.size());

        arc.add(200);
        arc.add(300);
        arc.add(400);
        arc.add(500);
        arc.add(600);
        //Dublicate elements from an array list
        //ArrayList<String> names = new ArrayList<String>(Arrays.asList("ravi","ravi","sahi","vijaya","sathvika"));
        LinkedHashSet<String> names1 = new LinkedHashSet<String>(Arrays.asList("ravi", "ravi", "sahi", "vijaya", "sathvika"));
        // ArrayList<String> dublicatenames= new ArrayList<String>(names1);
        System.out.println(names1);

        //JDK 8-Stream

        LinkedHashSet<String> names2 = new LinkedHashSet<String>(Arrays.asList("ravi", "ravi", "sahi", "vijaya", "sathvika"));
        List<String> unique = names2.stream().distinct().collect(Collectors.toList());
        System.out.println(unique);

        ArrayList<String> names = new ArrayList<String>(Arrays.asList("ravi", "ravi", "sahi", "vijaya", "sathvika"));

        ArrayList<String> names4 = new ArrayList<String>(Arrays.asList("ravi", "ravi", "nekk", "vijaya", "sathvika"));
        //find out the missing elements
        names.removeAll(names4);
        System.out.println(names);
        //find out the common elements.
        names.retainAll(names4);
        System.out.println(names);


    }
}
