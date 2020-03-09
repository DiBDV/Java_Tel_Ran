package telran;

import java.util.Scanner;

public class Dialog {
    static Scanner scanner = new Scanner(System.in);

    public static  double getParameter(){
        System.out.println("Enter the  number");

        double a = scanner.nextDouble();
        return a;
    }

    public static int operationChoice(){
        System.out.println("Enter operation symbol");
        System.out.println("1 - Addition");
        System.out.println("2 - Subtraction");
        System.out.println("3 - Multiplication");
        System.out.println("3 - Division");

        int operation = scanner.nextInt();

        while (operation < 1 || operation > 4){
            System.out.println("Error: Enter another number");
            operation = scanner.nextInt();
        }
        scanner.close();
        return operation;


    }

}
