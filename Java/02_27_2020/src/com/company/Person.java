package com.company;

public class Person {
    int age;
    String name;

    public void print(){
        System.out.println(name + ": " + age + " лет");
    }

/*    public void setPersonField(String name, int age){
        this.name = name;
        this.age = age;
    }*/

// это метод конструктор
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

}

//конструкотор который вызвается когда создается класс ???
