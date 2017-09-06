/* Test Program for Pythagorean */
public class PythagoreanTest {
    public static void main(String[] args){
        Pythagorean triangle = new Pythagorean();
        double triangleHyp = triangle.calculateHypotenuse(3, 6);
        System.out.println("Hypotenuse of triangle is "+triangleHyp);
    }
}
