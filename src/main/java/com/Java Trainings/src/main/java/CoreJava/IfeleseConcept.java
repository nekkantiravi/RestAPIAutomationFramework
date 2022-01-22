package CoreJava;

public class IfeleseConcept {

    public static void main(String[] args) {

        int a = 100;
        int b = 200;
        int c = 300;

        if (a > b) {
            System.out.println("a is greater than b");
        } else {
            System.out.println("b is greater than a");
        }

        //to find the highest number
        //nested if-else
        int a1 = 400;
        int b1 = 500;
        int c1 = 600;
        if (a1 > b1 & a1 > c1) {
            System.out.println("a1 is greater");
        } else if (b1 > c1) {
            System.out.println("b1 is greater");
        } else {
            System.out.println("c1 is greater");
        }
    }
}
