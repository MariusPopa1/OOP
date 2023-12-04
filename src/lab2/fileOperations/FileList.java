package lab2.fileOperations;

import java.io.File;
import java.util.ArrayList;
import java.util.List;


public class FileList {
    public static List<String> getSnapshotFiles(File folder) {
        List<String> snapshotFiles = new ArrayList<>();
        File[] files = folder.listFiles();
        if (files != null) {
            for (File file : files) {
                snapshotFiles.add(file.getName());
            }
        }
        return snapshotFiles;
    }
}
// no point in conditions, since my directory is an existing constant, and we're going to use a list
// to store the file names, since they are unique anyway
