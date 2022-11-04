package practice21_22;

public class CreateTextDocument implements ICreateDocument{
    @Override
    public IDocument CreateNew() {
        System.out.println("New");
        return new TextDocument();
    }

    @Override
    public IDocument CreateOpen() {
        System.out.println("Open");
        return new TextDocument();
    }
}
