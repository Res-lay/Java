package t1215.Ex1;

public class Main {
    public static void main(String[] args) {
        Person man = new Person("John", "Volkov", "Vladislavovich");
        Person woman = new Person("Mishel", "Stone");
        System.out.println(man.getInitial());
        System.out.println(woman.getInitial());
    }
}