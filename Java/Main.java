package com.telran.project1;

public class Main {
    public static void main(String[] args){
        System.out.println("Hello !");
        int a = 10;
        System.out.println(a); //to print function "a"
        System.out.println(a + " This is a number " + a) // to print "10 This is a number 10"
        // Quotes to show it's a string


        float f = 3,15; //incompatible, we need to set f after 3,15, so it'll be 3,15f
        long b = 1345453089205442l; // 'l' should be present to make sure it's a long number

        boolean boo =  2 < 3; //to show it's true or false
        System.out.println(boo);

        int height = 175;
        if(height>200){
            System.out.println("Go to Circus");
        }else if(height<150){
            System.out.println("Go to school");
        }else {
            System.out.println("Go to work");
        }

        }
        Scanner scanner = new Scanner(System.in);
        int age;
        System.out.println("Please enter your age");
        age = scanner.nextInt();

        army(age);


        powerXY(x: 3, y: 3);
     //возведение в степень, powerXY - название функции
     private static void powerXY(int x, int y) {
         int res = 1;
         for(int i = 1; i <=y; i++){
             res = res * x;
         }
         System.out.println("Power is " + res);
    }
        fan(mode: 3);
    // switch function
    private static void fan(int mode){
        switch (mode){
            case 0:
                System.out.println("fan is off");
                break;
            case 1:
                System.out.println("fan is min"):
                break;
            case 2;
                System.out.println("fan is high");
            default:
                System.out.println("Wrong mode");
        }
    }
    age(x: 19);
    // 18 - 27 в армию. если не то наслаждайся жизнью
    private static void age(int x){
        if (x<=18){ //if age>=18 && age<=27
            System.out.println("You're too youn for army");
        }else if (x>18; x<27){
            System.out.println("Be ready for army");
        }else {
            System.out.println("You're free");
        }
    }
 
}
