package CoreJava;

public class DataTypes {

    public static void main(String[] args) {

        DataTypes dt = new DataTypes();
        System.out.println(DataTypes.s);
        //System.out.println(i);
        //dt.sum(10,30);
        DataTypes.sum(20, 30);
    }

    //Primitive Datatypes: int, char,float,double,boolean
    //int
    int i = 10;
    int j = 30;
    //System.out.println("The value of i is:" + i);

    //char:only single digit values, but written in single quote.

    char c = 's';
    char f = 'd';

    // System.out.println("the value of f is:" + f);

    //String: String is a class, not a datatype

    static String s = "ravi";
    String h = "Nekkanti";

public static void sum(int i, int j){
    //this.i=i;
    //this.j=j;

    System.out.println(i+j);
    }
}
