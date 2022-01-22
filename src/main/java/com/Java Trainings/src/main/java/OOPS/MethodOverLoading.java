package OOPS;

public class MethodOverLoading {

    public static void main(String[] args){
        MethodOverLoading o=new MethodOverLoading();
        o.sum();
        o.sum(10);
        o.sum(5,10);
    }
    public void sum(){
        System.out.println();


    }
public void sum(boolean i){

}
    public void sum(int i){
        System.out.println(i);

    }

    public void sum(int i, int j){
        System.out.println(i+j);
    }
}
