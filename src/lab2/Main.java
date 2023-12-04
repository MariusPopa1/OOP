package lab2;

import lab2.fileOperations.FileList;
import lab2.fileOperations.FileTaskOperator;

import java.io.File;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Commit commit = new Commit();
        Set<String> lastSnapshotFiles = new HashSet<>();

        String folderPath = "C:\\Users\\Asus\\Documents\\Pentagon_Files";
        File folder = new File(folderPath);

        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.print("Enter command: ");
            String input = scanner.nextLine();
            String[] parts = input.split(" ");
            String command = parts[0].toLowerCase();

            switch (command) {
                case "commit":
                    FileTaskOperator commitExecutor = new FileTaskOperator(commit);
                    commitExecutor.execute(parts);
                    lastSnapshotFiles = FileList.getSnapshotFiles(folder);
                    break;
                case "info":
                    FileTaskOperator infoOperator = new FileTaskOperator(new Info());
                    infoOperator.execute(parts);
                    break;
                case "state":
                    FileTaskOperator statusExecutor = new FileTaskOperator(
                            new State(commit.getSnapshotTime(), lastSnapshotFiles));
                    statusExecutor.execute(parts);
                    break;
                case "exit":
                    running = false;
                    break;
                default:
                    System.out.println("Invalid command");
            }
        }
    }
}