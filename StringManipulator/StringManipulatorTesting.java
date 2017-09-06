/* Test program for StringManipulator */

public class StringManipulatorTesting {
    public static void main(String[] args){
        String concatenatedStr;
        Integer a;
        Integer b;
        Integer c;
        Integer d;
        Integer e;
        char letter = 'o';
        String word = "Hello";
        String subString = "llo";
        String notSubString = "world";

        StringManipulator manipulator = new StringManipulator();

        concatenatedStr = manipulator.trimAndConcat("   Hello   ","   World   ");
        System.out.println(concatenatedStr);  // HelloWorld

        a = manipulator.getIndexOrNull("Coding", letter);
        b = manipulator.getIndexOrNull("Hello World", letter);
        c = manipulator.getIndexOrNull("Hi", letter);
        System.out.println(a); // 1
        System.out.println(b); // 4
        System.out.println(c); // null

        d = manipulator.getIndexOrNull(word, subString);
        e = manipulator.getIndexOrNull(word, notSubString);
        System.out.println(d); // 2
        System.out.println(e); // null

        String wordNew = manipulator.concatSubstring("Hello", 1, 2, "world");
        System.out.println(wordNew); // eworld
    }
}
