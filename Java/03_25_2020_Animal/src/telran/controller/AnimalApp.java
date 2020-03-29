package telran.controller;

import telran.data.Animal;
import telran.data.Cat;
import telran.data.Dog;
import telran.data.Horse;

public class AnimalApp {
    public static void  main(String[] args){
        Dog dog1 = new Dog(4, "Sharik");
        Cat cat1 = new Cat(5, "Barsik");
        Horse horse1 = new Horse(7, "Zwezdochka");
        Animal dog2 = new Dog(2,"Tuzik");

        horse1.setName("Pegasus");
        cat1.setName("Murzik");

        System.out.println(horse1.getAge());

        Animal[] animals = {dog1, dog2, cat1, horse1};
        for (Animal a:animals) {
            a.voice();
        }

        System.out.println("");
        for (Animal a:animals) {
            a.play();
        }

        System.out.println();
        for (Animal a:animals) {
            System.out.println(a);
        }
    }
}
