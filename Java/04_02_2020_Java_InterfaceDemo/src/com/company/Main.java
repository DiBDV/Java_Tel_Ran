package com.company;

public class Main {
    public static void main(String[] args) {

        CashOut[] cashOuts = {
                new ATM(),
                new Clerk()
        };

        Person person = new Person("Andy");
        for (int i = 0; i < cashOuts.length; i++){
            cashOuts[i].cashOut(person);
        }
    }
}
// интерфейс - обещание класса выполнять действие к внешнему миру
// реализуя класс мы обговаривает, что он будет обладать какими -то свойствами
// наследовине - это переиспользование кода
// интрефейс - обещание класса выполнять какую-то функцию
