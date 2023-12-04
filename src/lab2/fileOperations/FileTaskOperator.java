package lab2.fileOperations;

public class FileTaskOperator {
    private FileTask fileTask;

    public FileTaskOperator(FileTask fileAction) {
        this.fileTask = fileAction;
    }

    public void execute(String[] args) {
        fileTask.execute(args);
    }
}
//Executor for operations defined by the FileTask interface.