package t1;

public class TestBook {
    public static void exec() {
        Book book1 = new Book("Wuthering Heights", "Emily Bronte");
        Book book2 = new Book("The Call of the Wild");

        book2.setAuthor("Jack London");
        System.out.println(book1);
        System.out.println(book2);
    }
}
