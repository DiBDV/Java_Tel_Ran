package com.company;

public class Main {
    public static void main(String[] args) {
        Employee em1 = new Employee("Nick", 1000);
        System.out.println(em1);

        em1.doWork();
        em1.pay();

        System.out.println("------------ MANAGER -----------");
        Manager manager1 = new Manager("Jack", 2000);
        System.out.println(manager1);
        System.out.println("getter " +  manager1.getName());
        manager1.pay();
        manager1.doWork();

        System.out.println(" --------------- PROGRAMMER ------------");
        Programmer progr1 = new Programmer("Oleg", 2000, 10);
        System.out.println(progr1);
        System.out.println(progr1.getName());
        progr1.pay();
        progr1.doWork();

        System.out.println(" -------------------- array of employees ---------------");
        Employee[] employees = {manager1, progr1};
        for (int i = 0; i < employees.length; i++){
            employees[i].pay();
            employees[i].doWork();
        }

        //экземпляк класса майн
//        Main main1 = new Main();
//        mai

        User user = new User();
//        Object ==> Employee ==> Manager, Programmer
        manager1.
    }
}
