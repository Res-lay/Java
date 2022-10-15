package t21_22;

public class CreateTextDocument implements ICreateDocument{

    @Override
    public IDocument createNew() {
        System.out.println("creared");
        return new TextDocument();
    }

    @Override
    public IDocument createOpen() {
        System.out.println("opened!");
        return new TextDocument();
    }
}
