package practice21_22;

public interface ICreateDocument {
    IDocument CreateNew();
    IDocument CreateOpen();
    IDocument CreateSave();
    IDocument CreateExit();
}
