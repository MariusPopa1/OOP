import java.util.Scanner;

class MathUtils {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter Number");
        int sum = 0;
        int number = myObj.nextInt();
        for (int i = 1; i < number; i++)
            if (i % 3 == 0|| i % 5 == 0)
                sum += i;
        System.out.println(sum);
    }

}
// It does not include the number, because in the example it would be 33 if it included it.
