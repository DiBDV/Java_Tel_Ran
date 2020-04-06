package telran.data;

public interface Printable {
//    все объекты реализуемые через этот интерфейс могут быть напечатаны

    void print();

    default void print2(){
        System.out.println("Undefined");
    }

//     относится ко всему классу
    static void print1(){
        System.out.println("reading is good");
    }

}
