package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        if (printToInclusive >= 0) {
            System.out.println(1);
        }
        int factorial = 1, multiplier = 1;
        while (multiplier <= printToInclusive) {
            factorial *= multiplier;
            System.out.println(factorial);
            multiplier++;
        }
    }
}