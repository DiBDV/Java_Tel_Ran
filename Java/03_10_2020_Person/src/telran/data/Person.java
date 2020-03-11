package telran.data;

public class Person {
    private String name;
    Address address;

    public Person() { }

    public Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Person: " + name + '\n' +
                address + '\n' ;
    }

    public static void displayArrayPerons(Person[] persons){
        for (Person p:persons){
            System.out.println(p.toString());
        }

    }

    public static void displayPersons(Person[] persons){
        for (int i = 0; i < persons.length; i++) {
            if(persons[i]!=null)
            System.out.println(persons[i]);
        }
    }

//    выбирать перстону и показывать где тот живет
    public static void findByName(Person [] persons, String name){
        int flag = 0;
        for (int i = 0; i < persons.length; i++) {
            if (persons[i].getName().equalsIgnoreCase(name)){
                System.out.println(name + "lives in " + persons[i].getAddress().getCity());
                flag = 1;}
            }
        if(flag < 0){
            System.out.println("This Person is not found");
        }
    }
    public static void listCityMembers(Person [] persons, String city){
        int flag = 0;
        for(Person p:persons){
            if(p.getAddress().getCity().equalsIgnoreCase(city)){
                System.out.println(p);
                flag = 1;
            }
        }if(flag < 0){
            System.out.println("city not found");
        }
    }

    public static Person[] listCityMembers(Person[] persons, String city, int size){ //тут показан полиморфизм в Java; название функции такое же, но параметны другие
        int i = 0;
        Person[] cityMembers = new Person[size];
        for (Person p:persons) {
            if(p.getAddress().getCity().equalsIgnoreCase(city)){
                cityMembers[i] = p;
                i++;
            }
        }return cityMembers;
    }

}


//hometask
//найти все имена котрые живут в Берлине
//findNameByCity


//hometask
//если приходит неправильный город как сделать так, чтобы не создавался пустой массив