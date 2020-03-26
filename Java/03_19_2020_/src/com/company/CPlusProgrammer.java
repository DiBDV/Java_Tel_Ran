package com.company;

public class CPlusProgrammer extends Programmer {
    public CPlusProgrammer(String name, int salary, int experience) {
        super(name, salary, experience);
    }

    public void doWork(){
        System.out.println("I'm programmer/ I write super project");
    }
}
