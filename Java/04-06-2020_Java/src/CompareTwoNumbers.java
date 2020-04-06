public class CompareTwoNumbers {
//    Given 2 integers a and b return true if a is greater that b, false otherwise.

    public boolean compareNumbers(int a, int b){
        return a >= b;

    }

    public String concat(String s1, String s2){
        return s1+s2.substring(0,3);
    }

//ivan;petrov -> Person(fistName = "Ivan", lastName = "Pertrov")



//             variant 1:
//        return (a>b);
//             variant 2:
//        return a>b?true:false;
//        if(a>b){
//            return true;
//        }else{
//            return false;
//        }
//    }

}
// в Java один метод это один юнит
