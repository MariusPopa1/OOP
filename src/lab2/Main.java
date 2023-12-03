package lab2;


    import java.io.File;

    class ListFilesInFolder {
        public static void main(String[] args) {
            String folderPath = "C:\\Users\\Asus\\Documents\\Pentagon_Files";
            File folder = new File("C:\\Users\\Asus\\Documents\\Pentagon_Files");

            if (folder.isDirectory()) {
                File[] files = folder.listFiles();
                if (files != null) { 
                    System.out.println("Files in the folder:");
                    for (File file : files) {
                        System.out.println(file.getName());
                    }
                } else {
                    System.out.println("No files found in the folder.");
                }
            } else {
                System.out.println("The specified folder does not exist or is not a directory.");
            }
        }
    }

