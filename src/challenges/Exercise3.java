package challenges;

import java.util.Scanner;

class Diamond {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter Size");
        int size = myObj.nextInt();
        int spaces;
        for (int i = 1; i <= size; i = i + 2) {
            spaces = (size - i) / 2;
            for (int j = 0; j < spaces; j++)
                System.out.print(" ");
            for (int j = 0; j < i; j++)
                System.out.print("*");
            System.out.println();
        }
        for (int i = size-2; i > 0; i = i - 2) {
            spaces = (size - i) / 2;
            for (int j = 0; j < spaces; j++)
                System.out.print(" ");
            for (int j = 0; j < i; j++)
                System.out.print("*");
            System.out.println();
        }
    }
}
