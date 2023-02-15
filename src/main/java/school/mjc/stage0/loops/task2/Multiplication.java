package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        if (multiplyByAndToInclusive == 0) {
            return;
        }
        int limit = Math.abs(multiplyByAndToInclusive);
        int number = 0;
        while (number <= limit) {
            System.out.println(number * multiplyByAndToInclusive);
            number++;
        }
    }
}
