package ua.job4j.array;

import java.util.Arrays;
/**
 * Class Класс удаляет повторяющиеся элементы из строкового массива.
 *
 * @author vfrundin
 * @version 1.0
 * @since 22.11.2017
 */
public class ArrayDuplicate {
    /**
     * Метод удаляет повторяющиеся значения из поданного на вход строкового массива и возвращает массив
     * состоящий из уникальных элементов.
     *
     * @param array Исходный строковый массив.
     * @return Arrays.copyOf(array, unique) - массив состоящий только из уникальных элементов.
     */
    public String[] remove(String[] array) {
        int unique = array.length;
        for (int out = 0; out < unique; out++) {
            for (int in = out + 1; in < unique; in++) {
                if (array[out].equals(array[in])) {
                    array[in] = array[unique - 1];
                    in--;
                    unique--;
                }
            }
        }
        return Arrays.copyOf(array, unique);
    }
}
