import java.util.ArrayList;

public class BasicJava {
    // Print 1-255
    public void printNumbers(){
        int idx;
        
        for(idx=1;idx<256;idx++){
            System.out.println(idx);
        }
    }

    // Print odd numbers between 1-255
    public void printOddNumbers(){
        int idx;

        for(idx=1;idx<256;idx=idx+2){
            System.out.println(idx);
        }
    }

    // Print sum
    public void findSum(){
        int idx;
        int sum = 0;

        for(idx=0;idx<256;idx++){
            sum = sum + idx;
            System.out.println("New number: "+idx+" "+"Sum: "+sum);
        }
    }

    // Iterating through an array
    public void traverseArray(int[] inArr){
        for(int num : inArr){
            System.out.println(num);
        }
    }

    // Find Max
    public void findMax(int[] inArr){
        int idx;
        int max = inArr[0];

        for(idx=1;idx<inArr.length;idx++){
            if(max < inArr[idx]){
                max = inArr[idx];
            }
        }
        System.out.println("Max value is "+max);
    }

    // Get Average
    public void findAvg(int[] inArr){
        int sum = 0;
        int numOfElements = inArr.length;
        double avg;

        for(int num : inArr){
            sum = sum + num;
        }

        avg = (double)sum/(double)numOfElements;

        System.out.println("Average value is "+avg);
    }

    // Array with Odd Numbers
    public ArrayList fillArr(){
        int idx;
        ArrayList<Integer> myArray = new ArrayList<Integer>();

        for(idx=1;idx<256;idx=idx+2){
            myArray.add(idx);
        }

        return myArray;
    }

    // Greater Than Y
    public int greaterVals(int[] inArr, int y){
        int count = 0;

        for(int number: inArr){
            if(number > y){
                count++;
            }
        }

        return count;
    }

    // Square the Values
    public int[] squareArrVals(int[] inArr){
        int idx;
        
        for(idx=0;idx<inArr.length;idx++){
            inArr[idx] = inArr[idx]*inArr[idx];
        }
        return inArr;
    }

    // Eliminate Negative Numbers
    public int[] replaceNegNum(int[] inArr){
        int idx;

        for(idx=0;idx<inArr.length;idx++){
            if(0 > inArr[idx]){
                inArr[idx] = 0;
            }
        }

        return inArr;
    }

    // Max, Min, and Average
    public ArrayList maxMinAvg(int[] inArr){
        int idx;
        int max = inArr[0];
        int min = inArr[0];
        int sum = 0;
        int numOfElements = inArr.length;
        int avg;
        ArrayList<Integer> myArray = new ArrayList<Integer>();

        for(idx=1;idx<inArr.length;idx++){
            if(max < inArr[idx]){
                max = inArr[idx];
            }
        }

        myArray.add(max);

        for(idx=1;idx<inArr.length;idx++){
            if(min > inArr[idx]){
                min = inArr[idx];
            }
        }

        myArray.add(min);

        for(int num : inArr){
            sum = sum + num;
        }

        avg = sum/numOfElements;

        myArray.add(avg);

        return myArray;
    }

    // Shifting the Values in the Array
    public int[] shiftArr(int[] inArr){
        int idx;

        for(idx=1;idx<inArr.length;idx++){
            inArr[idx-1] = inArr[idx];
        }
        inArr[inArr.length-1] = 0;

        return inArr;

    }
}
