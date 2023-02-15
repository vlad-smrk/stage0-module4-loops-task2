package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        if (power < 0) {
            System.out.println("too much power");
        }
        int currentNumber = 1, currentPower = 0;
        while (currentPower <= power) {
            System.out.println(currentNumber);
            currentNumber *= 2;
            currentPower++;
        }
    }
}
