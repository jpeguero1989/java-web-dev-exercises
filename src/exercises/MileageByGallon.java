package exercises;

import java.util.Scanner;

public class MileageByGallon {
    public static void main(String[] args)
    {
        double mileage;
        double gallon;
        Scanner input;

        input = new Scanner(System.in);

        System.out.println("   MILEAGE PER GALLON");

        System.out.print("Enter the mileage you ran: ");
        mileage = input.nextDouble();


        System.out.print("Enter the gallon of gas: ");
        gallon = input.nextDouble();

        double consumption = mileage / gallon;

        System.out.print("The miles per gallons is " + consumption);
    }
}
