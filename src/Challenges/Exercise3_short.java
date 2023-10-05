package Challenges;

import java.util.Scanner;
class Diamond_New {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter Size");
        int size = myObj.nextInt();

        for (int i = -5; i <= size; i = i + 2) {
            if (i == 1){
                continue;
            }
            int spaces = (java.lang.Math.abs(i)-1) / 2;
            int symbols = size - spaces*2;
            for (int j = 0; j < spaces; j++)
                System.out.print(" ");
            for (int j = 0; j < symbols; j++)
                System.out.print("*");
            System.out.println();
        }
    }
}

