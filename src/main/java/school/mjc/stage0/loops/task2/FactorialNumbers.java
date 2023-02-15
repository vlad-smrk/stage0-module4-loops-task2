package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int factorial = 1, multiplier = 1;
        while (factorial <= printToInclusive) {
            System.out.println(factorial);
            factorial *= multiplier;
            multiplier++;
        }
    }
}