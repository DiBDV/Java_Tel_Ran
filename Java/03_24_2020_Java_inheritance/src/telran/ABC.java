package telran;

public class ABC  {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        A ab = new B();
        A ac = new C();

        a = b;
        System.out.println("a = b " + a.getClass());
        a = (B)a;
        ab = (B)ab;
        ac = (C)ac;


        System.out.println(c instanceof B);
        System.out.println(c.getClass().getSuperclass());
        c.printC();
        System.out.println();
        c.printB();
        System.out.println();
        c.printA();
        System.out.println();
    }
}
