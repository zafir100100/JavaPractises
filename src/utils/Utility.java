package utils;

public class Utility
{

    // Write a program that will count number of notes from given array
    public void countNumberOfNotesFromAmouts(int amount, int[] denominations)
    {
        // if denominations is not initialized, initialize it
        if (denominations.length == 0)
        {
            denominations = new int[]
            {
                1000, 500, 100, 50, 20, 10, 5, 2, 1
            };
        }

        int denominationCount = denominations.length;

        // create copy of the amount
        int copy = amount;
        int totalNotes = 0, count = 0;

        System.out.println("Denominations : \n");

        // check for notes.
        for (int i = 0; i < denominationCount; i++)
        {
            // count number of notes.
            count = amount / denominations[i];
            if (count != 0)
            {
                System.out.println(denominations[i] + "\tx\t" + count + "\t= " + denominations[i] * count);
            }
            totalNotes = totalNotes + count; //finding the total number of notes
            amount = amount % denominations[i]; //finding the remaining amount whose Rsomination is to be found
        }
        System.out.println("--------------------------------");
        // printing the total amount
        System.out.println("TOTAL\t\t\t= " + copy);
        System.out.println("--------------------------------");
        // printing the total number of notes
        System.out.println("Total Number of Notes\t= " + totalNotes);
    }
}
