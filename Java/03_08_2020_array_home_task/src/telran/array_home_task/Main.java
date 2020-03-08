package telran.array_home_task;

public class Main {
    public static void main(String[] args) {
        int size = 20;
        int[] arr = new int[size];
        fillArray(arr);
        printArray(arr);
        returnMaxNumberInArray(arr);
    }

    public static void fillArray(int [] array){
        for (int i = 0; i < array.length; i++){
            array[i] = (int)(Math.random()*20);
        }
    }

    public static void printArray(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void returnMaxNumberInArray(int[] array){
        int max = array[0];
        for(int i = 0; i < array.length; i++){
            if(array[i] > max){
                max = array[i];
            }
        }
        System.out.println("The largest number in array is: " + max);
    }
}
