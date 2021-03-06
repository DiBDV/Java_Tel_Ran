package telran;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] array = new int[getSizeArray()];
        fillArray(array);
        printArray(array);
        int numberToDelete = getNumberToDelete();
        boolean check = isDeleteNumberInArray(array, numberToDelete);
        printResult(array, check, numberToDelete);

        scanner.close();
    }

//    public static void fillArray(int[] array){
//        for (int i = 0; i < array.length; i++) {
//            array[i] = (int)(Math.random()*20);
//        }
//    }

    public static int getSizeArray(){
        System.out.println("Enter size of array: ");
        return scanner.nextInt();
    }

    public static int[] fillArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter the number, please: ");
            array[i] = scanner.nextInt();
        }
        return array;
    }
    public static void printArray(int[] array){
        for (int num:array) {
            System.out.print(num + " ");
        }
    }

    public static int getNumberToDelete(){
        System.out.println();
        System.out.println("Please enter the number to delete: ");
        return scanner.nextInt();
    }

    public static int[] getArrayWithoutNumber(int[] array, int number){
        int[] newArray = new int[array.length - 1];
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]!= number){
                newArray[count++] = array[i];
            }
        }
        return newArray;
    }

    public static boolean isDeleteNumberInArray(int[] array, int number){
        for (int num:array) {
            if (num == number){
                return true;
            }
        }
        return false;
    }

    public static void printResult(int[] arr, boolean check, int number){
        if(check){
            System.out.println("Yes!!!");
            printArray(getArrayWithoutNumber(arr, number));
        }
        else{
            System.out.println("No such number ((( ");
        }
    }

}
/*

1) начать писать калькулятор на джава
к понедельнику

2)fillArray();
maxNumberInArray();
returnMaxNumberInArray(); (цикл for)

 */