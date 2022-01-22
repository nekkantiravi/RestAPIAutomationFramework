package CoreJava;

public class ConstructorConcept {

    String name;
    int age;
    int id;
    //Constructor is a function and never return a value
    // Constructor name will be as class name
    //this keyword is used to whenever we want to initialize class variables/Instance variables
    // with the current value of the constructor(Local variable) with in the class.
    public ConstructorConcept() {
        System.out.println("default constructor");
    }

    public ConstructorConcept(int i) {
        System.out.println("the value of i is:" +i);
    }

    public ConstructorConcept(String name, int age, int id){
        this.name=name;
        this.age=age;
        this.id=id;
    }
    public static void main(String[] args) {
        ConstructorConcept obj = new ConstructorConcept(10);

        ConstructorConcept obj1 = new ConstructorConcept("tom", 25, 1986);
        System.out.println("the value of 2 input parameters:" +obj1.name+ " " +obj1.age+ " "+ obj1.id);
    }
}
