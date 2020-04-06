package com.company;
/*
    [
    employee
        some parameters of employee.....
    ][Manager]
 */
public class Manager extends Employee{


    public Manager(String name, int salary, int experience) {
        super(name, salary, experience);
    }

    public Manager(String name, int salary) {
        super(name, salary);
    }

    @Override
    public String toString() {
        return "Manager{" + super.toString() + '}';
    }


    public void doWork(){
        System.out.println("I'm manager/ I say what programmer have to do");
    }

//    эта штука внизу с @ называется аннотацией и служит для подстраховывания
    @Override
    public String getName() {
        return "sir " +  super.getName();
    }

    public void pay(){
//        System.out.println(super.getName());
        System.out.println(temp);
        System.out.println("I've got " + ((this.getExperience()>5)?this.getSalary():this.getSalary()+3000));
    }
}
