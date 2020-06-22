package exercises;
import  java.util.Scanner;

public class Rectangle {
    public static void main(String[] args)
    {
        double length;
        double width;
        Scanner input;

        input = new Scanner(System.in);

        System.out.println("   RECTANGLE AREA");

        System.out.print("Enter the length: ");
        length = input.nextDouble();


        System.out.print("Enter the width: ");
        width = input.nextDouble();

        double area = length * width;

        System.out.print("The area of the rectangle is " + area);
    }


}
