package lab2;

import lab2.fileOperations.FileTask;

import java.util.Date;

public class Commit implements FileTask {
    private Date snapshotTime;

    public Commit() {
        snapshotTime = new Date();
    }

    @Override
    public void execute(String[] args) {
        snapshotTime = new Date();
        System.out.println("Snapshot time updated to: " + snapshotTime);
    }

    public Date getSnapshotTime() {
        return snapshotTime;
    }
}