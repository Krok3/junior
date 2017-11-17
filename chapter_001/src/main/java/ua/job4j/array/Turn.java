package ua.job4j.array;

/**
 * Class Класс позволяет перевернуть одномерный массив.
 * @author vfrundin
 * @since 15.11.2017
 * @version 1.0
 */
public class Turn {
    /**
     * Метод переворачивает одномерный целочисленный массив произвольной длины задом наперед.
     * @param array Исходный целочисленный массив.
     * @return array - целочисленный массив развернутый задом наперед.
     */
    public int[] back(int[] array) {
        int arrLength = array.length - 1;
        int halfLength = array.length / 2;

        for (int forward = 0, backward = arrLength; forward < halfLength; forward++, backward--) {
            int tmp = array[forward];
            array[forward] = array[backward];
            array[backward] = tmp;
        }
        return array;
    }
}
