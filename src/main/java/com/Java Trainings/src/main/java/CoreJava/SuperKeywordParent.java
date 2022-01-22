package CoreJava;

public class SuperKeywordParent {
    String name;
    int age;

    public SuperKeywordParent(){
        System.out.println("default constructor....parent");
    }
    public SuperKeywordParent(int i){

        System.out.println("one input parameter....parent:" +" "+i);

    }

    public SuperKeywordParent(String name, int age){
        //this.name=name;
        //this.age=age;

        System.out.println("two input parameter....parent:" +" "+ name+ " "+age);

    }
}
