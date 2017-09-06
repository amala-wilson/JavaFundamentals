/* Practice using if-else conditional */

public class FizzBuzz {
    public String fizzBuzz(int number){
        String outputMsg;

        if(number % 3 == 0 && number % 5 == 0){
            outputMsg = "FizzBuzz";
        }
        else if(number % 3 == 0){
            outputMsg = "Fizz";
        }
        else if(number % 5 == 0){
            outputMsg = "Buzz";
        }
        else {
            outputMsg = Integer.toString(number);
        }

        return outputMsg;
    }
}
