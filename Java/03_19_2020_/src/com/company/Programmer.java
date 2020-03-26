package com.company;

public class Programmer  {
Employee emp;

//    обязательно вызов конструктора родительского класса. как показано ниже
    public Programmer(String name, int salary, int experience) {
        Employee emp = new Employee(name,salary);
    }


//    далее расширяем наследника дополнительными методами

    @Override
    public String toString() {
        return "Programmer{" + super.toString() + '}';
    }

    @Override
    public void doWork(){
        System.out.println("I'm programmer/ I write super project");
    }

    public void pay(){
        System.out.println(this.getName());
        System.out.println("I've got " + ((this.getExperience()>5)?this.getSalary():this.getSalary()+2000));
    }
    public void codeGenerate(){
        System.out.println("generate code");
    }
}
