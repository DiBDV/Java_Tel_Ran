package com.company;

public class Main {

    public static void main (String[] args){
        //write your code here
        Person person1 = new Person("Olga", 20);
/*        person1.age = 20;
        person1.name = "Olga";*/

        Person person2 = new Person("Nick", 21);
/*        person2.name = "Nick";
        person2.age = 21;*/

        Person person3 = new Person("Sveta", 24);
/*        person3.name = "Sveta";
        person3.age = 24;*/

        Person person4 = new Person("Oleg", 30);
/*
 //       person4.setPersonField("Oleg",30);
        person4.setPersonField("Ivan", 28);
*/

        Person[] persons = {person1, person2, person3, person2};
//        int[] arr = {1,2,3,4,5};
        System.out.println(persons.length);
        printPersonArray(persons);

    }
    public static void printPersonArray(Person[] persons){
        for (int i=0; i<persons.length;i++){
            persons[i].print();
        }
    }
}

//что такое класс в Java
// что такое объект в Java
// чем отличается instance from object

