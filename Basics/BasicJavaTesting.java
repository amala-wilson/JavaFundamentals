/* Test program for Basic Java */

import java.util.ArrayList;

public class BasicJavaTesting {
    public static void main(String[] args){
        int[] x = {-1,-3,-5,-7,-9,-13};
        int[] y = {2,10,3};
        int[] z = {1,3,5,7};
        int[] j = {1,5,10,-2};
        int[] k;
        int[] l;
        int[] m;
        int count;
        int a = 3;
        BasicJava bj = new BasicJava();
        ArrayList<Integer> myArray = new ArrayList<Integer>();
        ArrayList<Integer> mySecondArray = new ArrayList<Integer>();
        
        // bj.printNumbers();
        // bj.printOddNumbers();
        // bj.findSum();
        // bj.traverseArray(x);
        // bj.findMax(x);
        // bj.findAvg(y);
        // myArray = bj.fillArr();
        // System.out.println(myArray);
        // count = bj.greaterVals(z,a);
        // System.out.println("Number of values greater than the value in a is "+count); 
        // k  = bj.squareArrVals(j);
        // for(int num : k){
        //     System.out.println(num);
        // } 
        // l  = bj.replaceNegNum(j);
        // for(int num : l){
        //     System.out.println(num);
        // } 
        // mySecondArray = bj.maxMinAvg(j);
        // System.out.println(mySecondArray);
        m = bj.shiftArr(j);
        for(int num : m){
            System.out.println(num);
        } 
    }
}
