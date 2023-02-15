package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int number = 0;
        while (number <= printToInclusive) {
            if (isPrime(number)) {
                System.out.println(number);
            }
            number++;
        }
    }

    boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }

        int factor = 2;
        int limit = (int) Math.round(Math.sqrt(number));
        while (factor <= limit) {
            if (number % factor == 0) {
                return false;
            }
            factor++;
        }
        return true;
    }
}
