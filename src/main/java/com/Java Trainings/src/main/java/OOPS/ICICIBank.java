package OOPS;

public class ICICIBank extends Bank {


    public static void main(String[] args){
        ICICIBank obj=new ICICIBank();

        obj.credit();
        obj.debit();

       Bank b =new ICICIBank();
       b.loan();
       b.credit();
       b.debit();
    }

    @Override
    public void loan() {

    }
}
