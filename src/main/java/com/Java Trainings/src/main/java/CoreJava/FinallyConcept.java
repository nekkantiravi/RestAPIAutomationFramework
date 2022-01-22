package CoreJava;

public class FinallyConcept {
    //finally is a block
    //even if the exception is not caught by the catch block, finally block will be executed.
    // finalize is a 'method' to clean up garbage process before GC methods is called for unnecessary creation of objects.

    public static void main(String[] args) {
        FinallyConcept f1 = new FinallyConcept();
        //System.out.println(f1.division());
        try {
            System.out.println(f1.division());
            throw new RuntimeException();
        } catch (ArithmeticException e) {

        } finally {
            System.out.println("test finally");
        }
    }

    public int division() {
        int a = 10;
        int b = 0;
        int c = a / b;
        return c;
    }
}
