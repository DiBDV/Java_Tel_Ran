package telran;

public class Main {
    public static void main(String[] args) {
        int a = 50;
        int b = 50;

        Integer c = 500;
        Integer d = 600;

        System.out.println(a==b); //сравниваем значение в памяти
        System.out.println(c.compareTo(d)); //сравниваем ссылку на адрес в памяти

        String str = "Hello! ";
        String str1 = "Vasja!";
        System.out.println(str.equals(str1));

        str1 = str.concat(str1);
        System.out.println(str1);

        str1 = str1.replace("! ", ", ");
        System.out.println(str1);
        System.out.println(str1);
        System.out.println(str1.codePointAt(1)); //указание на ячейку памяти
        String str3 = "one, two, three, ";
        String[] str4 = str3.split(", ");
        System.out.println(str4[0]);
    }
}

//hometask
//вызывать методы и посмотреть что из этого получится