package telran;

import java.util.Scanner;


public class Calculator {


    public static void calculation(double a, double b, int operation){
        double result;
        Scanner scanner = new Scanner(System.in);
        if (operation ==1){
            result = a + b;
        }else if(operation ==2){
            result = a - b;
        }else if(operation == 3){
            result = a * b;
        }else{
            if(b==0){
                while (b == 0){
                    System.out.println("Error: Enter another number");
                    b = scanner.nextDouble();
                }result = a / b;
            }else {
                result = a / b;
            }
        }scanner.close();
        System.out.println("Result is: "+ result);
    }


}
