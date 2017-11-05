package ua.job4j.loop;

/**
 * Class Класс для определения суммы четных чисел в заданном интервале.
 * @author vfrundin
 * @since 05.11.2017
 * @version 1.0
 */
public class Counter {

    /**
     * Метод должен вычислять сумму четных чисел в интервале от числа start до числа finish включительно.
     * @param start Минимальное число в интервала.
     * @param finish Максимальное число в интервала.
     * @return result - сумма четных чисел в интервале от start до finish включительно.
     */
    public int add(int start, int finish) {
        int result = 0;
        for (int i = start; i <= finish; i++) {
            result += (i % 2 == 0) ? i : 0;
        }
        return result;
    }
}
