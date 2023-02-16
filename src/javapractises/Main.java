package javapractises;

import java.util.Scanner;
import utils.Utility;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Utility obj = new Utility();
        // Write a program that will count number of notes from given array
        System.out.println("Enter the number of amount to get the denominations: ");
        System.out.println("");
        int amount = sc.nextInt();
        System.out.println("");
        obj.countNumberOfNotesFromAmouts(amount, new int[]
        {
        });
    }

}
