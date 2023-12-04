package lab2.fileOperations;


import java.io.File;
import java.util.Scanner;

public class Code extends GeneralFile{
    // general practice of inheritance, by using "extends"
    private final FileInformation fileInfo = new FileInformation();
    File file = fileInfo.getFile(fileName);
    int lineCount;
    int classCount;
    int methodCount;
    boolean insideMethod;

    public Code(String fileName, String extension, String createdDate, String lastModifiedDate) {
        super(fileName, extension, createdDate, lastModifiedDate);
        this.lineCount = getLineCount();
        this.classCount = getClassCount();
        this.methodCount = getMethodCount();
    }

    public int getLineCount() {
        try (Scanner scanner = new Scanner(file)) {
            int lineCount = 0;
            while (scanner.hasNextLine()) {
                scanner.nextLine();
                lineCount++;
            }
            return lineCount;
        } catch (Exception e) {
            return 0;
        }
    }

    // Method to get class count in the code file
    public int getClassCount() {
        int classCount = 0;
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine().trim();
                if (line.contains("class") || line.contains("enum")) {
                    classCount++;
                }
            }
        } catch (Exception e) {
            classCount = 0;
        }
        return classCount;
    }

    // Method to get method count in the code file
    public int getMethodCount() {
        int methodCount = 0;
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine().trim();
                if (line.contains("def") || line.contains("public") || line.contains("protected") || line.contains("private")) {
                    insideMethod = true;
                }
                if (insideMethod && line.endsWith("}")) {
                    insideMethod = false;
                    methodCount++;
                }
            }
        }catch (Exception e) {
            methodCount = 0;
        }
        return methodCount;
    }

    @Override
    public String toString() {
        return "File name: " + fileName + "\n" +
                "Extension: " + fileExtension + "\n" +
                "Created date: " + fileCreatedDate + "\n" +
                "Last modified date: " + fileModifiedDate + "\n" +
                "Line count: " + lineCount + "\n" +
                "Class count: " + classCount + "\n" +
                "Method count: " + methodCount + "\n" ;
    }
}