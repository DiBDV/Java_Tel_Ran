package telran.data;

public abstract class Animal {
    protected int age;
    protected String name;

    public Animal(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void play(){
        System.out.println("I play");
    }
    public abstract void voice();

    @Override
    public String toString() {
        return "Animal: ";
    }
}
