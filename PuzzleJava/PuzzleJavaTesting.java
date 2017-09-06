/* Test program for PuzzleJava */

import java.util.ArrayList;

public class PuzzleJavaTesting {
    public static void main(String[] args){
        PuzzleJava puzzle = new PuzzleJava();
        ArrayList<Integer> myArray = new ArrayList<Integer>();
        ArrayList<String> mySecondArray = new ArrayList<String>();
        ArrayList<Integer> myThirdArray = new ArrayList<Integer>();
        ArrayList<Integer> myFourthArray = new ArrayList<Integer>();
        String msg;
        ArrayList<String> myFifthArray = new ArrayList<String>();

        myArray = puzzle.randomNumArr();
        System.out.println(myArray);

        mySecondArray = puzzle.namesArr();
        System.out.println(mySecondArray);

        puzzle.alphabetArr();

        myThirdArray = puzzle.generateArr();
        System.out.println(myThirdArray);

        myFourthArray = puzzle.sortedArr();
        System.out.println("Sorted Array: "+myFourthArray);
        System.out.println("Min value: "+myFourthArray.get(0));
        System.out.println("Max value: "+myFourthArray.get(myFourthArray.size()-1));

        msg = puzzle.generateStr();
        System.out.println(msg);

        myFifthArray = puzzle.generateStrArr();
        System.out.println(myFifthArray);
    }
}
