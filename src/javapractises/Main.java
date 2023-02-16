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
        String word1 = sc.next();
        obj.getVowelsAndConsonantsFromWord(word1);
        // Encrypt word : for each letter, go to 5 letter forward but make A to E 
        System.out.println("Enter a word to encrypt: ");
        String word2 = sc.next();
        System.out.println(obj.getEncryptedWord1(word2));
        // Read and write into a json file
        System.out.println("Enter following information to save in json file: ");
        System.out.println("Enter name: ");
        String name = sc.next();
        System.out.println("Enter email: ");
        String email = sc.next();
        System.out.println("Enter password: ");
        String password = sc.next();
        System.out.println("Enter address: ");
        String address = sc.next();
        System.out.println("Enter mobile No: ");
        String mobileNo = sc.next();
        obj.updateJsonFile(name, email, password, address, mobileNo);
    }

}
