
import java.util.Scanner;

public class Rectangle {

    public static void main(String[] args) {

        float length, width, area, perimeter;
        Scanner in = new Scanner(System.in);

        System.out.print("Enter Height of rectangle: ");
        length = in.nextFloat();

        System.out.print("Enter width of rectangle: ");
        width = in.nextFloat();

        perimeter = 2 * (length + width);
        area = length * width;

        System.out.println("Perimeter of rectangle is " + perimeter + " units.");
        System.out.println("Area of rectangle is " + area + " sq. units.");
    }
}
