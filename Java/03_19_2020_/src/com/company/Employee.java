package com.company;

// пример как сделать наследования в ООП

public abstract class Employee {
    private String name;
    private int salary;
    private int experience = 0;
    private int bonus;
    protected int temp;


    public Employee(String name, int salary, int experience, String bonus) {
        this.name = name;
        this.salary = salary;
        this.experience = experience;
    }

    public Employee(String name, int salary, String bonus) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public int getExperience() {
        return experience;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", experience=" + experience +
                '}';
    }

//    абстрактный метод
    public abstract void pay();
//    абстрактный метод
    public abstract void doWork();
}
