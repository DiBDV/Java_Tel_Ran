package telran.personApp;

import telran.data.Address;
import telran.data.Person;
import static telran.data.Person.findByName;
import static telran.data.Person.listCityMembers;

public class Main {
    public static void main(String[] args) {

        Person p1 = new Person("Jevgenijs", new Address());
        p1.setAddress(new Address("Riga", "Prospect N", 100));
        Person p2 = new Person("Arion", new Address("Berlin", "Friedrichstrasse", 30));
        Address address1 = new Address("Palma de Mallorka", "Barselona boulevard", 5);
        Person p3 = new Person ("Sergey", address1 );
        Person p4 = new Person ("Alina", new Address("Paris", "Saint Denis", 7));
        Person p5 = new Person ("Lubov", new Address("London", "Baker", 221));

        Person[] persons = new Person[] {p1, p2, p3,  p4, p5};

//        Person.displayArrayPersons(persons);

        System.out.println(p1);
        p1.getAddress().setCity("Sigulda");
        System.out.println(p1);
        System.out.println(p1.toString());
        System.out.println(p1.getAddress().getCity());
        System.out.println(p1.getName() + " lives on the" + p1.getAddress().getStreet());
        findByName(persons, "Luba");

        Person[] cityMembers = Person.listCityMembers(persons, "Berin", 5);
        Person.displayPersons(cityMembers);
    }
}
