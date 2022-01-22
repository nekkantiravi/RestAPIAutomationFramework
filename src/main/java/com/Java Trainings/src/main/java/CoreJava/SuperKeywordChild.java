package CoreJava;

public class SuperKeywordChild extends SuperKeywordParent {

    public SuperKeywordChild() {
        //super(10);
        super("tom", 25);

//Super keyword is used to call parent class constructor and should be written
// in the child class constructor always, and it should be the first statement.
        System.out.println("default const...child");
    }

    public static void main(String[] args) {
        SuperKeywordChild obj = new SuperKeywordChild();



    }
}
