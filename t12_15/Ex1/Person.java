package t12_15.Ex1;

public class Person {
    StringBuilder initial;
    Person(String Name, String Surname, String Patronymic){
        initial = new StringBuilder(Surname + " " + Name + " " + Patronymic);
    }

    Person(String Name, String Surname){
        initial = new StringBuilder(Surname + " " + Name);
    }

    public StringBuilder getInitial() {
        return initial;
    }
}
