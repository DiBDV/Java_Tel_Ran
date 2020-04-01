import static java.lang.Math.*;

public class FindNumbers {

    public static void main(String[] args) {
        findNumbers(20,4);

//        numberInRange(10,15);
//        recursion1(20, 30);
//        recursion2(7);
        recursionSecondNumber(10, 20);

    }
    public static void findNumbers(int a, int b) {
        int min = abs(a);
        int max = abs(b);
        for (int i = min + 1; i < max; i++) {
            System.out.println(i);
        }
    }

// another variant of the task
//    public static void numberInRange(int num1, int num2){
//        if (num1 < num2)
//            for (int j = num1; j <= num2 ; j++) {
//                System.out.println(j + " ");
//            }
//        else if (num1 > num2)
//            for (int j = num1; j >= num2 ; j++) {
//                System.out.println(j + " ");
//            }
//        else {
//            System.out.println(num1 + " ");
//        }
//    }

//    public static void recursion1(int num1, int num2){
//            if (num1 == num2) {
//                System.out.println(num1 + " ");
//            } else if (num1 < num2) {
//                recursion1 (num1, num2-1);
//                System.out.println(num2 + " ");
//            } else {
//                recursion1 (num1, num2+1);
//                System.out.println(num2 + " ");
//            }
//        }

    public static void recursionSecondNumber(int num1, int num2){
        if (num1 == num2) {
            System.out.println(num1 + " ");
        } else if (num1 < num2) {
            recursionSecondNumber (num1, num2-2);
            System.out.println(num2 + " ");
        } else {
            recursionSecondNumber (num1, num2+2);
            System.out.println(num2 + " ");
        }
    }


//    public static String recursion2(int n){
//        if(n==1) {
//            return n + "";
//        }else{
//            return recursion2(n-1) + " "  + n;
//        }
//    }



}
