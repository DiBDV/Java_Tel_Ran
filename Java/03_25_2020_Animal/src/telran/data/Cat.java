package telran.data;

public class Cat extends Animal {
    public Cat(int age, String name) {
        super(age, name);
    }

    public void play(){
        System.out.println("I play with a mouse");
    }

    @Override
    public void voice() {
        System.out.println("meow - meow");
    }

    @Override
    public String toString() {
        return  super.toString() + this.getClass().getSimpleName() + " " + name +
                ", age " + age +
                " years";
    }
}
