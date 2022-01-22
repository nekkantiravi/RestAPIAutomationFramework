package OOPS;

import OOPS.HDFCBank;
import OOPS.USBank;

public class TestBank {

    public static void main(String[]args){

        HDFCBank hb=new HDFCBank();
        System.out.println(USBank.min_bal);

        hb.credit();//overridden methods
        hb.debit();
        hb.transferMoney();
        hb.carLoan();// HSBC class
        hb.educationLoan();
        hb.mutualFund();

        System.out.println("**************************");
       // Dynamic Polymorphism---child class object can be referred by a parent interface reference variable

        USBank U=new HDFCBank();
        U.credit();
        U.debit();
        U.transferMoney();
        hb.educationLoan();
        hb.carLoan();


    }
}
