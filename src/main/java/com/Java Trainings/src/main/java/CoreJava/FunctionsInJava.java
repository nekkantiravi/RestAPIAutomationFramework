package CoreJava;

public class FunctionsInJava {
    //Global/non-static variables
    int a = 10;
    String s = "ravi";
    static int b = 20;

    public static void main(String[] args) {
        FunctionsInJava obj = new FunctionsInJava();
        obj.add();
        //String n = obj.name();
        System.out.println("the value of string:" + obj.name());
        System.out.println("the value of global variable:" + obj.a);
        int z = 20;
        System.out.println(FunctionsInJava.b); //calling by class name-static variable


        System.out.println("the value of local variable:" + z);
        System.out.println(b);
        //int d = obj.division(40, 30);
        System.out.println("the value of division:" + obj.division(40, 30));

    }

    //non-static methods
    public static void test() { //no input no output
        System.out.println("test method");
    }

    public int add() { //return type int
        System.out.println("add method");
        int a = 20;
        int b = 30;
        int c = a + b;
        return c;
    }

    public String name() { //return type string
        System.out.println("division method");

        String S = "nekkanti";
        return S;
    }

    public int division(int x, int y) {//x,y input parameters/arguments
        System.out.println("division method");
        int z = x / y;
        return z;

    }
}
