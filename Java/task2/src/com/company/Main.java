package com.company;

public class Main {


    public static void main(String[] args){
        //объект new Date и 3 параметра для объекта
        Date date1;
        Date date2;
        date1 = new Date(10, 2,2020);
        date2 = date1.getRandomDate();

        date1.print();
        System.out.println(date1.isCorrect());
        System.out.println(" ---------");
        date2.print();

        System.out.println("day is: "+ date1.getDay());
        Person p1 = new Person("Ivan", 11, 12, 2000);
        System.out.println(p1.getAge());
        Person p2 = new Person("Lena", date1);
    }
}


//сделать массив дат. сгенерировать рандомную дату.
//написать метод сравнения дат и вставить в алгоритм сортировки

public int compareDate (Date date1, Date date2){

}