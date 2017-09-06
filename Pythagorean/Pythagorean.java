/* Implementation of Pythagorean Theorem */
public class Pythagorean {
    public double calculateHypotenuse(int sideA, int sideB){
        double sqSideA = Math.pow(sideA, 2);
        double sqSideB = Math.pow(sideB, 2);
        double sqSideC = sqSideA + sqSideB;
        double hypotenuse = Math.sqrt(sqSideC);

        return hypotenuse;
    }
}
