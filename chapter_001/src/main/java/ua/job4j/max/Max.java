package ua.job4j.max;

/**
 * Class Класс для нахождения максимума из двух целых чисел.
 * @author vfrundin
 * @since 01.11.2017
 * @version 1.0
 */
public class Max {

    /**
     * Method add.
     * @param first 1st number.
     * @param second 2nd number.
     * @return int maxValue.
     */
    public int max(int first, int second) {
        int maxValue;
        maxValue = (first >= second) ? first : second;
        return maxValue;
    }
}
