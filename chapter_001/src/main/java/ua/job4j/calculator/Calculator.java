package ua.job4j.calculator;

/**
 * Class Класс для вычисления результата арифметических операций +, -, *, :, ^.
 * @author vfrundin
 * @since 31.10.2017
 * @version 1
 */
public class Calculator {
    private double result;

    /**
     * Method add.
     * @param first 1st summand.
     * @param second 2nd summand.
     */
    public void add(double first, double second) {
        this.result = first + second;
    }

    /**
     * Method subtract.
     * @param first reduced.
     * @param second deductible.
     */
    public void subtract(double first, double second) {
        this.result = first - second;
    }

    /**
     * Method multiple.
     * @param first 1st multiplier.
     * @param second 2nd multiplier.
     */
    public void multiple(double first, double second) {
        this.result = first * second;
    }

    /**
     * Method div.
     * @param first divisible.
     * @param second divisor.
     */
    public void div(double first, double second) {
        this.result = first / second;
    }

    /**
     * Method that returns the result.
     * @return Result of arithmetic operation.
     */
    public double getResult() {
        return this.result;
    }
}

