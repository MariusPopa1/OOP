package lab2.fileOperations;

import java.io.File;
import java.util.HashSet;
import java.util.Set;

public class FileList {
    public static Set<String> getSnapshotFiles(File folder) {
        Set<String> snapshotFiles = new HashSet<>();
        if (folder.exists() && folder.isDirectory()) {
            File[] files = folder.listFiles();
            if (files != null) {
                for (File file : files) {
                    snapshotFiles.add(file.getName());
                }
            }
        }
        return snapshotFiles;
    }
}
// no point in conditions, since my directory is an existing constant, and we're going to use a list
// to store the file names, since they are unique anyway
