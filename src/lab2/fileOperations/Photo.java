package lab2.fileOperations;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;

    public class Photo extends GeneralFile {
    private final FileInformation fileInfo = new FileInformation();
    File file = fileInfo.getFile(fileName);
    String dimension;

    // Constructor
    public Photo(String imageName, String extension, String createdDate, String lastModifiedDate) {
        super(imageName, extension, createdDate, lastModifiedDate);
        this.dimension = getImageDimensions();
    }

    // get the image dimensions, using ImageIO extension
    String getImageDimensions() {
        try {
            BufferedImage image = ImageIO.read(file);
            int width = image.getWidth();
            int height = image.getHeight();
            return width + "x" + height;
        } catch (Exception e) {
            return "corrupt file ";
        }
    }

    // Override toString method to provide a custom string representation
    @Override
    public String toString() {
        return "Photo name: " + fileName + "\n" +
                "Extension: " + fileExtension + "\n" +
                "Created date: " + fileCreatedDate + "\n" +
                "Last modified date: " + fileModifiedDate + "\n" +
                "Dimension: " + dimension + "\n";
    }
}

