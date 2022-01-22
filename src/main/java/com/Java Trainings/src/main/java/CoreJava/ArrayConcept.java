package CoreJava;

public class ArrayConcept {
    //To store similar datatype values in an Array variable
    //lowest bound/index=0
    //upper bound/index=n-1(n is the size of the array)
    //dis-advantages of array 1.--Size is fixed--static array.To overcome this problem, we use collections in java
    //2. Stores only similar data types--To overcome this problem we use object array.
    int i = 20;


    public static void main(String[] args) {

        int i[] = new int[4];

        i[0] = 10;
        i[1] = 20;
        i[2] = 30;
        i[3] = 40;

        System.out.println(i[0]);
        System.out.println("length of array is:" + i.length);

        //print all the values of array use for loop
        for (int j = 0; j < i.length; j++) {
            System.out.println(i[j]);
        }
        String s[] = new String[3];

        s[0] = "ravi";
        s[1] = "nekkanti";
        System.out.println(s[1]);

        Object ob[] = new Object[4]; //object array(Object is a class). To store different data types values
        ob[0] = "kumar";
        ob[1] = 12;
        ob[2] = 12.33;
        ob[3] = true;

        System.out.println(ob[3]);

    }

}
