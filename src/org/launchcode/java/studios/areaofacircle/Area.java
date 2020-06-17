package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;
import java.lang.Math.*;

public class Area {
    public static void main(String[] args) {
        //double area;
        String radius;

        System.out.print("Radius value: ");
        Scanner inputRead = new Scanner(System.in);
        
        radius = inputRead.next();

        try
        {
            Double.parseDouble(radius);
            if (Float.parseFloat(radius)<=0) {
                System.out.println("Number should be greater than 0");
            }else{
                System.out.println("The area of the circle is " + Circle.getArea(Double.parseDouble((radius))));
            }
        }
        catch (NumberFormatException e)
        {
            System.out.println(radius + " is not a number");
        }


        //area = Math.PI*Math.pow(radius,2);
     

    }
}
