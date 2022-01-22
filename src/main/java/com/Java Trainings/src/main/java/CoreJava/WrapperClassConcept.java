package CoreJava;

import lombok.Getter;
import lombok.Setter;

public class WrapperClassConcept {
    //Data conversion
    public static void main(String[] args) {
        //String to Integer
        String x = "10";
        System.out.println(x + 100);
        //Data conversion:string to Int

        int i = Integer.parseInt(x);
        System.out.println("value is " + (i + 100));

        //Int to String conversion

        int j = 200;
        String S = String.valueOf(j);
        System.out.println("Int to String:" + (S + 20));

        //double to string
        double d = 22.34;

        String K = String.valueOf(d);
        System.out.println("double to string:" + K);

        //String to double
        String D = "12.33";
        Double L = Double.parseDouble(D);
        System.out.println("String to double:" + (L + 12.33));
        //String str="abc";
        char data[] = {'a', 'b', 'c'};
        String str1 = new String(data);
        System.out.println(str1);


    }


}
