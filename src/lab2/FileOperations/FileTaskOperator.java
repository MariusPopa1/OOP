package lab2.FileOperations;

public class FileTaskOperator {
    private FileTask fileTask;

    public FileTaskOperator(FileTask fileAction) {
        this.fileTask = fileAction;
    }

    public void execute(String[] args) {
        fileTask.execute(args);
    }
}
