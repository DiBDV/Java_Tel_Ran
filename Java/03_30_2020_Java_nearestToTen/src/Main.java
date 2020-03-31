public class Main {
    public static void main(String[] args) {

        System.out.println(nearestToTen(5,15));
    }
    public static int nearestToTen(int a, int b){
        int diffA = Math.abs(a - 10);
        int diffB = Math.abs(b - 10);

//        тернарный оператор
        return (diffA == diffB)? 0:(diffA < diffB)? a:b;
    }
}
