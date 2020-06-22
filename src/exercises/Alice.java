package exercises;

import java.util.Scanner;

public class Alice {
    public static void main(String[] args)
    {
        String aliceStr = "Alice was beginning to get very tired of sitting by her sister on the bank, " +
                "and of having nothing to do: once or twice she had peeped into the book her sister was " +
                "reading, but it had no pictures or conversations in it, 'and what is the use of a book,' " +
                "thought Alice 'without pictures or conversation?'";

        Scanner input = new Scanner(System.in);

        System.out.println("Enter term to search:");
        String term = input.nextLine();

        if (aliceStr.toLowerCase().contains(term.toLowerCase()))
        {
            int index = aliceStr.indexOf(term);
            System.out.println("The term '" + term + "' was found at index "+ index + " with a length of " + term.length());
            aliceStr = aliceStr.replaceFirst(term,"");
            System.out.println("New String is: " + aliceStr);
        }
        else
        {
            System.out.println("The term '" + term + "' was not found");
        }

    }
}
