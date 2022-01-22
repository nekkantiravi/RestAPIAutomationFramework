package OOPS;

import OOPS.BrazilBank;
import OOPS.USBank;

public class HDFCBank implements USBank, BrazilBank { // if a class is implementing any interface, then its mandatory
    // to define/override all the methods of interface


    @Override
    public void credit() {
        System.out.println(" HDFC---credit");
    }

    @Override
    public void debit() {
        System.out.println(" HDFC---debit");
    }

    @Override
    public void transferMoney() {
        System.out.println(" HDFC---transferMoney");
    }

    public void educationLoan() {
        System.out.println(" HDFC----educationLoan");
    }

    public void carLoan() {
        System.out.println(" HDFC---carLoan");
    }


    @Override
    public void mutualFund() {
        System.out.println("HDFC....mutualfund");
    }
}
