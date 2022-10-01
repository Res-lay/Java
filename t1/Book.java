package t1;

public class Book {
    private String name;
    private String author;

    public Book(String name, String author)
    {
        this.name = name;
        this.author = author;
    }

    public Book(String name)
    {
        this.name = name;
        this.author = "Unknown author";
    }

    public Book()
    {
        this.name = "Any Story";
        this.author = "Unknown author";
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String toString() {
        return "Name: " + this.name + ", Author: " + this.author;
    }
}
