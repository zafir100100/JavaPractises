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
        int amount = sc.nextInt();
        obj.countNumberOfNotesFromAmouts(amount, new int[]
        {
        });
        // Find out sum of digits of a number
        System.out.println("Enter the number to find out sum of digits: ");
        int number = sc.nextInt();
        System.out.println(obj.getSumOfDigits(number));
    }

}
