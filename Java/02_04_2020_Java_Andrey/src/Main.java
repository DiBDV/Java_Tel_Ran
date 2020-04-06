import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        f(1);
        System.out.println(factorial(7));

    }

    public static void f(int i){
        //// где то в методе сами себя вызываем и выполняем f()
        System.out.println("start" + i);
        i++;
        if (i<6) {
            f(i);
        }
        System.out.println("end" + i);
        return;
    }

    // !5 = 1*2*3*4*5
// решаем факториал числа
    public static int factorial (int n){
        if(n == 1)
            return 1;
        else
            return (n*factorial(n-1));
        }
// !5 = !4*5
//    !4 = !3*4
//    !3 = !2*3
//    !2 = !1*2
//    !1 = !1
}
