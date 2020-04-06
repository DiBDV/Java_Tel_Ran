package com.company;

public class ATM implements CashOut, CashIn{

    @Override
    public void cashOut(Person person) {
        System.out.println("ATM is giving money for " + person);
    }

    @Override
    public void cashIn() {

    }
}
