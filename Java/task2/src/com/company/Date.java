package com.company;

import java.util.Random;

public class Date {
    //поля класса
    private int day;
    private int month;
    private int year;
    private Random rnd = new Random(System.currentTimeMillis());
    Random rnd1 = new Random()

    //конструктор даты
    public Date(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;

    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setDay(int day) {
//        if (day>=1 && day <=31){
            this.day = day;
//        }else {
//            System.out.println("error day!");
//        }
    }



    public String toString(){
       String s = "Date: " + day + ".";
       s += month + ".";
       s += year;
       return s;
    }

    public void print(){
        System.out.println(this.toString());

    }

    public boolean isCorrect(){
        return isCorrectYear() &&
               isCorrectMonth() &&
               isCorrectDay();
    }

    private boolean isCorrectYear(){
        return (year > 0);
    }

    private boolean isCorrectMonth(){
        return (month>0) && (month<=12);
    }

    public boolean isCorrectDay(){
        if((day>0) && (day<=getDayPerMonth())){
            return true;
        }else {
            return false;
        }
    }

    public int getDayPerMonth(){
        int [] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        if (isLeapYear() && month ==2){
            return 29;
        } else {
            return days[month-1];

        }
    }

    public boolean isLeapYear(){
        return year%4==0;
    }

    public Date getRandomDate(){
        Date date;
        do {
            int year = getRandomInt(1900, 2030);
            int month = getRandomInt(1, 12);
            int day = getRandomInt(1, 31);
            date = new Date(day, month,  year);
        }while (!date.isCorrect());
        return date;

    }

    private int getRandomInt(int min, int max) {
        return min + rnd.nextInt(max - min + 1);
    }
}



//    Write bash script in $HOME/YOURNAME that:
//        1) Creates 200 files with file mask ( 001_3287462387.txt 002_248529345.txt 003_23432423.txt ... 00200_329428374.txt) where 00 is a permenent prefix, 1 2 3 ...200 increases incrementally, and a random goes after _
//        2) Same, but add date to the filename after random
//        3) * Same but files should be created once per second and timestamp in filename  should have seconds
//        4) ** Same as in #1, but the pattern is 001_312434213.txt ....  010_23423423.txt .... 100_234234234.txt 200_32984293.txt