package com.telran.project2;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        System.out.println("Guess the number");
        int range = 10;
        int number = (int)(Math.random()*10);
        while (true){
            System.out.println("My number is from 0 but less " + range);
            int inputNumer = scanner.nextInt();
            if (inputNumer == number){
                System.out.println("Bingo!!");
                break;
            }
            else if(inputNumer>number){
                System.out.println("My number is less");
            }else {
                System.out.println("My munber is greater");
            }
        }
        scanner.close();
    }
}
// HOME WORK:
// вынести логику программы в отдельный метод
// спросить диапазон чисел
// сканнер прописать в майн

