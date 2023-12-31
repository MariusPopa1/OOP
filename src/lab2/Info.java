package lab2;

import lab2.fileOperations.*;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Info implements FileTask {
    private final FileInformation fileInfo = new FileInformation();

    @Override
    public void execute(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: info <filename>");
            return;
        }

        String filename = args[1];
        File file = fileInfo.getFile(filename);

        if (file.exists()) {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String extension = filename.substring(filename.lastIndexOf('.') + 1);
            String createdDate = fileInfo.getCreationDate(file.toPath());
            String lastModifiedDate = dateFormat.format(new Date(file.lastModified()));

            switch (extension) {
                case "png", "jpg", "jpeg" -> {
                    Photo photo = new Photo(file.getName(), extension, createdDate, lastModifiedDate);
                    System.out.println(photo);
                }
                case "txt" -> {
                    Text text = new Text(file.getName(), extension, createdDate, lastModifiedDate);
                    System.out.println(text);
                }
                case "py", "java" -> {
                    Code code = new Code(file.getName(), extension, createdDate, lastModifiedDate);
                    System.out.println(code);
                }
            }
        } else {
            System.out.println("File not found: " + filename);
        }
    }
}
