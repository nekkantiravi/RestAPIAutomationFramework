package CoreJava;

public class StringConcatenation {

    public static void main(String[] args) {
        StringConcatenation obj = new StringConcatenation();

        int a = 100;
        int b = 200;

        String x = "Ravi";
        String y = "nekkanti";
        System.out.println(a+b+(x+y));
        System.out.println(x+y+(a+b));
        System.out.println(x+y+(a+b)); //+ sign is concatenation operator
    }


}
