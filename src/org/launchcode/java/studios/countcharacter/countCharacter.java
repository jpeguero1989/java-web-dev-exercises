package org.launchcode.java.studios.countcharacter;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class countCharacter {

    public static void main(String[] args) {
        String mainStr = "";
        try {
            File myObj = new File("C:\\Users\\Jhoan\\Desktop\\LC101 Goals.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                //System.out.println(data);
                mainStr = mainStr + data;
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
//Scanner input = new Scanner(System.in);


         /*mainStr = "If the product of two terms is zero then common sense says at " +
                "least one of the two terms has to be zero to start with. So if you move " +
                "all the terms over to one side, you can put the quadratics into a form " +
                "that can be factored allowing that side of the equation to equal zero. " +
                "Once you’ve done that, it’s pretty straightforward from there.";*/

        //System.out.println("Enter the word to count: ");
        //mainStr = input.nextLine();

        char[] charactersInString = mainStr.toCharArray();
        Map<Character,Integer> myHashMap = new HashMap<>();

        for (int i =0;i<charactersInString.length;i++)
        {

            char strKey = java.lang.Character.toLowerCase(charactersInString[i]);
            if (Character.isLetterOrDigit(strKey))
            {
                if (myHashMap.containsKey(strKey))
                {
                    //myHashMap.computeIfPresent(charactersInString[i], (k, v) -> v + 1);
                    myHashMap.put(strKey,myHashMap.get(strKey)+1);
                }
                else
                {
                    myHashMap.put(strKey,1);
                }
            }
        }

        for (Character i : myHashMap.keySet())
        {
            System.out.println(i + " : " + myHashMap.get(i));
        }
    }

}
