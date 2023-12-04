package lab2;
    import java.util.Scanner;
    import java.io.File;
    public class Main {
        public static void main(String[] args) {
            File folder = new File("C:\\Users\\Asus\\Documents\\Pentagon_Files");
            long lastCommit = 0;

            Scanner scanner = new Scanner(System.in);
            System.out.print("What would you like to do?" );
            char choice = scanner.next().charAt(0);

                File[] files = folder.listFiles();
                if (files != null) {
                    System.out.println("Files in the folder:");
                    for (File file : files) {
                        System.out.print(file.getName());
                        if (file.lastModified() > lastCommit){
                            System.out.println(" - Changed");
                        } else {
                            System.out.println(" - No changes");
                        }
                    }
                } else {
                    System.out.println("No files found in the folder.");
                }

        }

    }

