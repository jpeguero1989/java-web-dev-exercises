package exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.List;

public class ArrayListPractice {
    public static void main(String[] args) {
        //printEvenNombers();
        printWordFive();
    }

    public static void printEvenNombers()
    {
        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(5);
        myList.add(50);
        myList.add(3);
        myList.add(47);
        myList.add(8);
        myList.add(76);
        myList.add(24);
        myList.add(37);
        myList.add(96);
        myList.add(57);

        for (int i=0;i< myList.size();i++)
        {
            if (myList.get(i)%2 ==0)
            {
                System.out.println(myList.get(i));
            }
        }
    }

    public static void printWordFive()
    {
        String wordStr=" I would not, could not, in a box. " +
                "I would not, could not with a fox. I will not eat them in a house. " +
                "I will not eat them with a mouse.";

        String[] wordArray = wordStr.split(" ");

        Scanner input = new Scanner(System.in);

        System.out.println("Insert the length: ");

        int length = input.nextInt();

        List<String> myList = new ArrayList<String>();

        myList = Arrays.asList(wordArray);

        for (int i=0;i< myList.size();i++)
        {
            if (myList.get(i).length() ==length)
            {
                System.out.println(myList.get(i));
            }

        }
    }
}