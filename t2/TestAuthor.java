package t2;

public class TestAuthor {
    public static void exec()
    {
        Author author = new Author("Sue Grant","suGrant@somewhere.com", 'F');

        author.getName();
        author.getEmail();
        author.getGender();

        author.setEmail("newemail@somewhere.com");

        System.out.println(author);
    }
}
