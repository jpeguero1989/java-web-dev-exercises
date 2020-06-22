package exercises;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args)
    {
        int[] numberArr = {1, 1, 2, 3, 5, 8};

        for (int i =0;i<numberArr.length;i++)
        {
            if (numberArr[i]%2!=0)
            {
                System.out.println(numberArr[i]);
            }
        }

        String mainStr = " I would not, could not, in a box. " +
                "I would not, could not with a fox. I will not eat them in a house. " +
                "I will not eat them with a mouse.";
        String[] split = mainStr.split("\\.");

        System.out.println(Arrays.toString(split));
    }
}
