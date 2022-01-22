package Lombok;

public class NeverAgain {
    public static void main(String[] args) {
        Cat myCat = new Cat();
        myCat.setAge(20);
        myCat.setName("ravi");
        myCat.setWeight(12.4f);
        //System.out.println("Values are :" + myCat.getAge() + "," + myCat.getName() + "," + myCat.getWeight());

        System.out.println(myCat);
    }

}
