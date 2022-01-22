package Collections;

import org.apache.hc.core5.http.io.SessionOutputBuffer;

import java.security.KeyStore;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

//No order, no Indexing
//Stores values in Key, Value par <k,v>
//Can store n number of null value, but only one null key
// no thread safe---un synchronized
public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, String> countrypin = new HashMap<String, String>();
        countrypin.put("USA", "wahington");
        countrypin.put("India", "Delhi");
        countrypin.put("Italy", "Rome");
        countrypin.put("UK", "London");
        countrypin.put("lanka", "Colombo");
        countrypin.put("Italy", "Rome2");

        //Traversing map
        for (Map.Entry entry : countrypin.entrySet()) {
            System.out.println(entry.getKey()+ " " + entry.getValue());


        }
        System.out.println("******************************");
        System.out.println(countrypin.get("Italy"));
        //Iterate hashmap using java 8 Lambda expression
        countrypin.forEach((k, v) -> System.out.println("Key=" + k + "," + "value=" + v));
        //Iterate over the set pair:using entry set
        System.out.println("**********");

        //Iterator:over the set (pair): by using entry set
        Iterator<Map.Entry<String, String>> entry = countrypin.entrySet().iterator();
        while (entry.hasNext()) {
            Map.Entry ele = entry.next();
            System.out.println("Key=" + ele.getKey() + ", " + "Value=" + ele.getValue());
        }

        HashMap<String, Integer> countrypin1 = new HashMap<String, Integer>();
        countrypin1.put("USA", 23423423);
        countrypin1.put("India", 3342323);
        //countrypin1.put("Italy", 4543534);
        countrypin1.put("UK", 2424234);
        countrypin1.put("lanka", 5345345);
        countrypin1.put("Italy", 678768768);

        //Iterator:over the set (pair): by using entry set
        System.out.println("********************");
        Iterator<Map.Entry<String, Integer>> entry1 = countrypin1.entrySet().iterator();
        while (entry1.hasNext()) {
            Map.Entry ele1 = entry1.next();
            System.out.println("Key=" + ele1.getKey() + ", " + "Value=" + ele1.getValue());
        }

        //Iterator:over the keys by using key set
        System.out.println("^^^^^^^^^^^^^^");
        Iterator<String> entry2 = countrypin1.keySet().iterator();
        while (entry2.hasNext()) {
            String key = entry2.next();
            Integer value = countrypin1.get(key);
            System.out.println("key=" + key + "," + "value=" + value);
        }
    }

}
