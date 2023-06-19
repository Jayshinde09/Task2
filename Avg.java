import java.util.Scanner;

public class Avg {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please Enter the first Number = ");
        double num1 = sc.nextDouble();

        System.out.print("Please Enter the Second Number = ");
        double num2 = sc.nextDouble();

        System.out.print("Please Enter the Third Number = ");
        double num3 = sc.nextDouble();

        double average = (num1 + num2 + num3) / 3;
        System.out.println("\nThe Average of Three Numbers = " + average);
    }
}