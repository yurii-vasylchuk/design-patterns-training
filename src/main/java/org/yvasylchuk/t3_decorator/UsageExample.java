package org.yvasylchuk.t3_decorator;

public class UsageExample {
    public static void main(String[] args) {
        Calculator directCalculator = new CalculatorImpl();
//        Calculator timingCalculator = new TimingCalculatorDecorator(directCalculator);
//        Calculator loggingCalculator = new LoggingCalculatorDecorator(timingCalculator);
//
//        loggingCalculator.plus(1, 2);
//        loggingCalculator.minus(1, 2);
//        loggingCalculator.multiply(1, 2);
    }
}
