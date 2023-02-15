package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        if (printToInclusive == 0) {
            System.out.println("0");
            return;
        }

        int previous = 0, number = 1;
        while (number <= printToInclusive) {
            System.out.println(number);
            int temp = number;
            number += previous;
            previous = temp;
        }
    }
}