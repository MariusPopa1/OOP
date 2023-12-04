package lab2.fileOperations;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileInformation {
    private final String folderPath = "C:\\Users\\Asus\\Documents\\Pentagon_Files"; //constant folder path

    public File getFile(String filename) {
        return new File(folderPath + File.separator + filename);
    }
    // get a specific file from the folder

    public String getCreationDate(Path path) {

        BasicFileAttributes attributes;
        try {
            attributes = Files.readAttributes(path, BasicFileAttributes.class);
        } catch (Exception e) {
            return "Corrupt file";
        }
        FileTime creationTime = attributes.creationTime();
            return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(creationTime.toMillis()));
    }
    // gets the creationDate of the file and formats it accordingly
    // the IOException handles errors, like when the file isn't found, so it doesn't all crash and burn
}
