package com.company;

public class Clerk implements CashOut{

    @Override
    public void cashOut(Person person) {
        System.out.println("clerk is giving money for " + person);

    }
}
