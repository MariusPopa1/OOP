package challenges;
import java.util.Scanner;

class  User {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter Name ");

        String name = myObj.nextLine();
        String shortName =Character.toUpperCase(name.charAt(0))+".";

        for (int i = 0; i < name.length() - 1; i++)
            if (name.charAt(i) == ' ') {
                shortName = shortName + Character.toUpperCase(
                        name.charAt(i + 1));
                shortName = shortName + "."; }
        System.out.println(shortName);
    }
}