package telran.data;

public class Dog extends Animal {
    public Dog(int age, String name) {
        super(age, name);
    }

    @Override
    public void play(){
        System.out.println("I play with a ball");
    }

    @Override
    public void voice() {
        System.out.println("Gav-Gav");
    }

    @Override
    public String toString() {
        return  super.toString() + this.getClass().getSimpleName() + " " + name +
                ", age " + age +
                " years";
    }
}
