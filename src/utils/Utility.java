package utils;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Utility
{

    // Print prime numbers between 2 numbers
    public void getPrimesBetweenTwoNumbers(int firstNumber, int secondNumber)
    {
        // Declaring the variables
        int x, y, flg;

        // Printing display message
//        System.out.println("All the Prime numbers within " + firstNumber + " and " + secondNumber
//                + " are:");
        // Using for loop for traversing all
        // the numbers from 1 to secondNumber
        for (x = firstNumber; x <= secondNumber; x++)
        {

            // Omit 0 and 1 as they are
            // neither prime nor composite
            if (x == 1 || x == 0)
            {
                continue;
            }

            // Using flag variable to check
            // if x is prime or not
            flg = 1;

            for (y = 2; y <= x / 2; ++y)
            {
                if (x % y == 0)
                {
                    flg = 0;
                    break;
                }
            }

            // If flag is 1 then x is prime but
            // if flag is 0 then x is not prime
            if (flg == 1)
            {
                System.out.print(x + " ");
            }
        }
    }

    // Write a program that will count number of notes from given array
    public void getNumberOfNotesFromAmouts(int amount, int[] denominations)
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

//        System.out.println("Denominations : \n");
        // check for notes.
        for (int i = 0; i < denominationCount; i++)
        {
            // count number of notes.
            count = amount / denominations[i];
            if (count != 0)
            {
//                System.out.println(denominations[i] + "\tx\t" + count + "\t= " + denominations[i] * count);
                System.out.println(denominations[i] + " " + count);
            }
            totalNotes = totalNotes + count; //finding the total number of notes
            amount = amount % denominations[i]; //finding the remaining amount whose Rsomination is to be found
        }
//        System.out.println("--------------------------------");
        // printing the total amount
//        System.out.println("TOTAL\t\t\t= " + copy);
//        System.out.println("--------------------------------");
        // printing the total number of notes
//        System.out.println("Total Number of Notes\t= " + totalNotes);
    }

    // Find out sum of digits of a number
    public int getSumOfDigits(int number)
    {
        int digit, sum = 0;
        while (number > 0)
        {
            //finds the last digit of the given number    
            digit = number % 10;
            //adds last digit to the variable sum  
            sum = sum + digit;
            //removes the last digit from the number  
            number = number / 10;
        }
        return sum;
    }

    // Count Vowels and consonants from a word
    public void getVowelsAndConsonantsFromWord(String word)
    {
        //Counter variable to store the count of vowels and consonant    
        int vCount = 0, cCount = 0;

        //Converting entire string to lower case to reduce the comparisons    
        word = word.toLowerCase();

        for (int i = 0; i < word.length(); i++)
        {
            //Checks whether a character is a vowel    
            if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u')
            {
                //Increments the vowel counter    
                vCount++;
            }
            //Checks whether a character is a consonant    
            else if (word.charAt(i) >= 'a' && word.charAt(i) <= 'z')
            {
                //Increments the consonant counter    
                cCount++;
            }
        }
        System.out.println("Vowel: " + vCount);
        System.out.println("Consonant: " + cCount);
    }

    //encrypt word : for each letter, go to 5 letter forward but make A to E 
    public String getEncryptedWord1(String word)
    {
        // Encryption algo: go to 4 letter forward
        int l = word.length();
        String newWord = "";
        // using simple for-loop
        for (int i = 0; i < l; i++)
        {
            // special rule: if it is A, make it E
            if ((char) word.charAt(i) == 'A')
            {
                newWord += "E";
                continue;
            }
            newWord += (char) (word.charAt(i) + 5);
        }
        return newWord;
    }

    // read and write into a json file
    public void updateJsonFile(String name, String email, String password, String address, String mobileNo)
    {
        try
        {
            String fileName = "resources/users.json";
            File file = new File(fileName);
            // if file doesn't exist
            if (!file.exists())
            {
                // create the file
                boolean isFileCreated = file.createNewFile();
                // if file creation failed, exit
                if (!isFileCreated)
                {
                    System.out.println("File creation failed");
                    return;
                }
                // if file creation successful
                // initialize it with a blank json array
                FileWriter myWriter = new FileWriter(file);
                myWriter.write("[]");
                myWriter.close();
            }
            // note: this json file can't be blank initially
            // put {} or [] in file first, or it will generate
            // parse error
            FileReader reader = new java.io.FileReader(fileName);
            org.json.simple.parser.JSONParser parser = new JSONParser();

            Object obj = parser.parse(reader);
            JSONArray jsonArray = (JSONArray) obj;
            JSONObject userObject = new JSONObject();
            userObject.put("name", name);
            userObject.put("email", email);
            userObject.put("password", password);
            userObject.put("address", address);
            userObject.put("mobileNo", mobileNo);
            jsonArray.add(userObject);

            FileWriter fw = new FileWriter(fileName);
            fw.write(jsonArray.toJSONString());
            fw.flush();
            fw.close();

            parser.reset();
            reader.close();
        }
        catch (Exception ex)
        {
            System.out.println("Json file update failed");
        }
    }
}
