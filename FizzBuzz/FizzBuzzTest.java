/* Test program to FizzBuzz */
public class FizzBuzzTest {
    public static void main(String[] args){
        String msg;
        FizzBuzz fb = new FizzBuzz();

        msg = fb.fizzBuzz(3);
        System.out.println(msg);
        msg = fb.fizzBuzz(5);
        System.out.println(msg);
        msg = fb.fizzBuzz(15);
        System.out.println(msg);
        msg = fb.fizzBuzz(2);
        System.out.println(msg);
    }
}
