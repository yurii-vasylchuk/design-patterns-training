package org.yvasylchuk.t3_decorator;

import java.util.Random;

public class CalculatorImpl implements Calculator {
    private Random rnd = new Random();

    @Override
    public int plus(int a, int b) {
        try {
            Thread.sleep(50 + rnd.nextInt(100));
        } catch (InterruptedException ignored) {
        }
        return a + b;
    }

    @Override
    public int minus(int a, int b) {
        try {
            Thread.sleep(50 + rnd.nextInt(100));
        } catch (InterruptedException ignored) {
        }
        return a - b;
    }

    @Override
    public int multiply(int a, int b) {
        try {
            Thread.sleep(50 + rnd.nextInt(100));
        } catch (InterruptedException ignored) {
        }
        return a * b;
    }
}
