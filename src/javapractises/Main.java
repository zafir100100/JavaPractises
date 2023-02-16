package javapractises;

import java.util.Scanner;
import utils.Utility;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Utility obj = new Utility();
        // Print prime numbers between 2 numbers
        System.out.println("Prime numbers between 2 and 100 are: ");
        obj.getPrimesBetweenTwoNumbers(2, 100);
        System.out.println("");
        // Write a program that will count number of notes from given array
        System.out.println("Enter the number of amount to get the denominations: ");
        int amount = sc.nextInt();
        obj.getNumberOfNotesFromAmouts(amount, new int[]
        {
        });
        // Find out sum of digits of a number
        System.out.println("Enter the number to find out sum of digits: ");
        int number = sc.nextInt();
        System.out.println(obj.getSumOfDigits(number));
        // Count Vowels and consonants from a word
        System.out.println("Enter a word to count Vowels and consonants: ");
        String word = sc.next();
        obj.getVowelsAndConsonantsFromWord(word);
    }

}
