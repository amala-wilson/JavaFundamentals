/* Implementing different problems */

import java.util.*;
import java.util.ArrayList;
import java.util.Random;

public class PuzzleJava {
    /* Function that finds the sum of all the numbers in the array and returns an array containing numbers greater than 10 */
    public ArrayList<Integer> randomNumArr(){
        int[] randomValArr = {3,5,1,2,7,9,8,13,25,32};
        int sum = 0;
        ArrayList<Integer> myArray = new ArrayList<Integer>();

        for(int number: randomValArr){
            sum = sum + number;
            if(number > 10){
                myArray.add(number);
            }
        }
        
        System.out.println("The sum of the randomValArr is "+sum);

        return myArray;
    }

    /* Function that shuffles an array containing names, prints each name, and returns an array with names greater than 5 chars */
    public ArrayList<String> namesArr(){
        String[] names = {"Nancy","Jinichi","Fujibayashi","Momochi","Ishikawa"};
        Random rand = new Random();
        int randomPosition;
        String temp;
        ArrayList<String> myArray = new ArrayList<String>();

        // Shuffle array of names
        for (int i=0;i<names.length;i++){
            randomPosition = rand.nextInt(names.length);
            temp = names[i];
            names[i] = names[randomPosition];
            names[randomPosition] = temp;
        }

        for(String name: names){
            System.out.println(name);
            if(name.length() > 5){
                myArray.add(name);
            }
        }

        return myArray;
    }

    /* Function that shuffles an array containing alphabet letters, prints each letter, prints the last letter in the shuffled array, and displays a message if the first letter in the shuffled array is a vowel */
    public void alphabetArr(){
        Random rand = new Random();
        int randomPosition;
        char temp;
        char[] alphaArr = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

        // Shuffle array of alphabets
        for (int i=0;i<alphaArr.length;i++){
            randomPosition = rand.nextInt(alphaArr.length);
            temp = alphaArr[i];
            alphaArr[i] = alphaArr[randomPosition];
            alphaArr[randomPosition] = temp;
        }

        System.out.println("Last letter of the alphabet array is "+alphaArr[alphaArr.length-1]);
        System.out.println("First letter of the alphabet array is "+alphaArr[0]);

        // Check if the first letter in the array is a vowel
        if (alphaArr[0] == 'a' || alphaArr[0] == 'e' || alphaArr[0] == 'i' || alphaArr[0] == 'o'  || alphaArr[0] == 'u'){
            System.out.println("Hi, I am a vowel");
        }

        return;
    }

    /* Function that generates and returns an array with 10 random numbers between 55-100 */
    public ArrayList<Integer> generateArr(){
        Random rand = new Random();
        ArrayList<Integer> myRandArr = new ArrayList<Integer>();

        int idx;
        int randomNum;

        for(idx=0;idx<10;idx++){
            randomNum = rand.nextInt((100-55)+1)+55;
            myRandArr.add(randomNum);
        }

        return myRandArr;
    }

    /* Function that generates and returns an array with 10 sorted random numbers between 55-100 */
    public ArrayList<Integer> sortedArr(){
        ArrayList<Integer> myArray = new ArrayList<Integer>();

        myArray = generateArr();

        Collections.sort(myArray);

        return myArray;
    }

    /* Function that creates a random string of 5 characters long */
    public String generateStr(){
        char[] alphaArr = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        int idx, randomPosition;
        String randStr = "";

        Random rand = new Random();
        
        for(idx=0;idx<5;idx++){
            randomPosition = rand.nextInt(alphaArr.length);
            randStr = randStr + alphaArr[randomPosition];
        }

        return randStr;
    }

    /* Function that generates an array of random strings, each 5 character long */
    public ArrayList<String> generateStrArr(){
        ArrayList<String> strArr = new ArrayList<String>();

        int idx;

        for(idx=0;idx<10;idx++){
            strArr.add(idx, generateStr());
        }

        return strArr;
    }
}
