package com.company;

public class Date {
    //поля класса
    int day;
    int month;
    int year;

    public Date(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;

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

    boolean isCorrect(){
        return isCorrectYear() &&
               isCorrectMonth() &&
               isCorrectDay();
    }

    boolean isCorrectYear(){
        return (year > 0);
    }

    boolean isCorrectMonth(){
        return (month>0) && (month<=12);
    }

    boolean isCorrectDay(){
        if((day>0) && (day<=getDayPerMonth())){
            return true;
        }else {
            return false;
        }
    }

    int getDayPerMonth(){
        int [] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        if (isLeapYear() && month ==2){
            return 29;
        } else {
            return days[month-1];

        }
    }

    boolean isLeapYear(){
        return year%4==0;
    }
}
